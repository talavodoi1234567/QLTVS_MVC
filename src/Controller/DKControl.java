package Controller;

import Model.TKDAO;
import Model.TaiKhoan;
import View.View_DangKy;
import View.View_DangNhap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class DKControl {
    View_DangKy view;
    TKDAO tkdao = new TKDAO();
    TaiKhoan u;

    public DKControl(View_DangKy view) {
        this.view = view;
        view.btnLoginActionPerformed(new LoginListener());
        view.btnDangKiActionPerformed(new SignupListener());
    }

    String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

    class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            View_DangNhap viewDangNhap = new View_DangNhap();
            DNControl controlDangNhap = new DNControl(viewDangNhap);
            viewDangNhap.setVisible(true);
            //view.setVisible(false);
            view.dispose();
        }
    }

    class SignupListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String user = view.jtuser.getText();
            String pass = view.jfpwd.getText();
            String email = view.jtGmail.getText();
            String confirm = view.jfcrf.getText();
            if (user.equals("") || pass.equals("") || email.equals("") || confirm.equals("")) {
                view.showMessage("Vui lòng điền đầy đủ thông tin");
            } else {
                if (tkdao.checkUser(user)) {
                    if (patternMatches(email, regexPattern)) {
                        if (pass.equals(confirm)) {
                            TaiKhoan u = new TaiKhoan(user, pass, email);
                            Boolean success = tkdao.signup(u);
                            if (success) {
                                view.showMessage("Đăng kí thành công");
                                View_DangNhap viewDangNhap = new View_DangNhap();
                                DNControl dnControl = new DNControl(viewDangNhap);
                                viewDangNhap.setVisible(true);
                                //view.setVisible(false);
                                view.dispose();
                            } else {
                                view.showMessage("Đăng kí thất bại");
                                reset();
                            }
                        } else {
                            view.showMessage("Mật khẩu không trùng nhau");
                            reset();
                        }
                    } else {
                        view.showMessage("Email định dạng không đúng");
                        reset();
                    }
                } else {
                    view.showMessage("Đã tồn tại username, hãy đặt lại");
                    reset();
                }

            }
        }

        public void reset() {
            View_DangKy.jfpwd.setText("");
            View_DangKy.jfcrf.setText("");
            View_DangKy.jtuser.setText("");
            View_DangKy.jtGmail.setText("");
        }
    }
}
