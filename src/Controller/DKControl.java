package Controller;

import Model.TKDAO;
import View.View_DangKy;
import View.View_DangNhap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DKControl {
    View_DangKy view;
    TKDAO tkdao;

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

        }
    }
}
