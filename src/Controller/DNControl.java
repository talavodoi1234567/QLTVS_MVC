package Controller;

import Model.TKDAO;
import Model.TaiKhoan;
import View.View_DangKy;
import View.View_DangNhap;
import View.View_ThuVien;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DNControl implements ActionListener
{
    TKDAO tkdao= new TKDAO();
    View_DangNhap view = new View_DangNhap();
    TaiKhoan model;

    @Override
    public void actionPerformed(ActionEvent e) {

    }

        public DNControl(View_DangNhap view){
        this.view = view;
        view.btndangnhapActionPerformed(new dangnhapListener());
        view.btnThemTkActionPerformed(new ThemTkListener());
    }
    class dangnhapListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        if(checkEmptyField()){
                view.showMessage("Vui lòng điền thông tin");
        } else
        {
            if(tkdao.login(view.txtusername.getText(),view.jfpwd.getText() )){
                view.showMessage("Đăng nhập thành công");
                view.setVisible(false);
                View_ThuVien viewThuVien = new View_ThuVien();

            }else {
                view.showMessage("Invalid username and/or password!");

            }
        }


        }
    }
    class ThemTkListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            View_DangKy viewDangKy= new View_DangKy();
            viewDangKy.setVisible(true);

        }
    }
    public boolean checkEmptyField()
    {
        if(view.txtusername.getText().equals("") || view.jfpwd.getText().equals(""))
        {
            return true;
        }
        return false;
    }
}
