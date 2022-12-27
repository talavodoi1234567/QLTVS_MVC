package Controller;

import Model.TKDAO;
import Model.TaiKhoan;
import View.View_DangKy;
import View.View_DangNhap;
import View.View_ThuVien;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DNControl {
   private View_DangNhap view;
   private TKDAO tkdao;
    public DNControl(View_DangNhap view) {
        this.view = view;
        tkdao = new TKDAO();
        view.AddbtndangnhapActionPerformed(new AddLoginListener());
        view.AddbtnThemTkActionPerformed(new AddSignupListener());

    }
    class AddLoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        if(view.txtusername.getText().equals("")||view.jfpwd.getText().equals("")){
            view.showMessage("Vui lòng điền đẩy đủ các thông tin");
        }else
        {     Boolean sucess =  tkdao.login(view.txtusername.getText(),view.jfpwd.getText());
              if(sucess) {
                  view.showMessage("Đăng nhập thành công");
                  view.setVisible(false);
                  View_ThuVien viewThuVien = new View_ThuVien();
              } else
              {
                  view.showMessage("Đăng nhập thất bại");
              }

        }
        }
    }
    class AddSignupListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            View_DangKy viewDangKy = new View_DangKy();
            viewDangKy.setVisible(true);
            DKControl dkControl= new DKControl(viewDangKy);
            //view.setVisible(false);
            view.dispose();
        }
    }
}
