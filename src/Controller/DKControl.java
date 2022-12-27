package Controller;

import Model.TKDAO;
import Model.TaiKhoan;
import View.View_DangKy;
import View.View_DangNhap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DKControl {
    View_DangKy view;
    TKDAO tkdao = new TKDAO();
    TaiKhoan u;

    public DKControl(View_DangKy view){
        this.view= view;
        view.btnLoginActionPerformed(new LoginListener());
        view.btnDangKiActionPerformed(new SignupListener());
    }
    class LoginListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            View_DangNhap viewDangNhap= new View_DangNhap();
            viewDangNhap.setVisible(true);
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
                    view.setVisible(false);
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
