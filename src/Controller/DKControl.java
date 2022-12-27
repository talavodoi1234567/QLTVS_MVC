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

    public DKControl(View_DangKy view){
        this.view= view;
        view.btnLoginActionPerformed(new LoginListener());
        view.btnDangKiActionPerformed(new SignupListener());
    }
    String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }
    class LoginListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            View_DangNhap viewDangNhap= new View_DangNhap();
            DNControl controlDangNhap = new DNControl(viewDangNhap);
            viewDangNhap.setVisible(true);
            //view.setVisible(false);
            view.dispose();
        }
    }
    class SignupListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        if (view.jtuser.getText().equals("")||view.jfpwd.getText().equals("")||view.jtGmail.getText().equals("")||view.jfcrf.getText().equals(""))
        {
            view.showMessage("Vui lòng điền đầy đủ thông tin");
        }else {
            if(view.jfpwd.getText().equals(view.jfcrf.getText())){
                TaiKhoan u = view.getTaiKhoan();
                Boolean success= tkdao.signup(u);
                if(success){
                    view.showMessage("Đăng kí thành công");
                    View_DangNhap viewDangNhap = new View_DangNhap();
                    DNControl dnControl = new DNControl(viewDangNhap);
                    viewDangNhap.setVisible(true);
                    //view.setVisible(false);
                    view.dispose();
                } else {
                    view.showMessage("Đăng kí thất bại");
                }
            }else {
                view.showMessage("Mật khẩu không trùng nhau");
                reset();
            }
        }
        }
        public void reset() {
            View_DangKy.jfpwd.setText("");
            View_DangKy.jfcrf.setText("");
        }
    }
}
