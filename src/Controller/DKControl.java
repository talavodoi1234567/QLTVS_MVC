package Controller;

import Model.TKDAO;
import Model.TaiKhoan;
import View.View_DangKy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DKControl {
        TKDAO tkdao = new TKDAO();
        View_DangKy view =new View_DangKy();
        TaiKhoan model;
        public DKControl (View_DangKy view){
            this.view = view;
            view.btnDangKiActionPerformed(new DangKiListener());
            view.btnLoginActionPerformed(new LoginListener());
        }
        class DangKiListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }
        class LoginListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }
}
