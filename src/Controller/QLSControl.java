package Controller;

import Model.SachDAO;
import Model.Sach_ThuVien;
import View.View_DangNhap;
import View.View_TTSach;
import View.View_ThuVien;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QLSControl {
    View_TTSach view;
    SachDAO sachDAO = new SachDAO();
    Sach_ThuVien sach;
    public QLSControl (View_TTSach view){
        this.view= view;
        view.BtnPrint1ActionPerformed(new Print1ActionListener());
        view.BtnSuaActionPerformed(new SuaActionListener());
        view.BtnThemActionPerformed(new ThemActionListener());
        view.BtnThoatActionPerformed(new Thoat1ActionListener());
        view.BtnTkActionPerformed(new TKActionListener());
        view.BtnTrolaiActionPerformed(new TroLaiActionListener());
        view.BtnXoaActionPerformed(new XoaActionListener());
        view.BtnResetActionPerformed(new ResetActionListener());
        sachDAO.hienThiSach();
    }
    class Print1ActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    class SuaActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    class ThemActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int th = JOptionPane.showConfirmDialog(view, "Bạn có muốn thêm", "Confirm", JOptionPane.YES_NO_OPTION);
            if (th != JOptionPane.YES_OPTION) {
                return;
            }
            String masach = view.ms.getText();
            String tensach = view.ts.getText();
            String nhaxb = view.nnxb.getText();
            int  namxb = Integer.parseInt(view.nxb.getText());
            int gia = Integer.parseInt(view.txtgia.getText());
            int soluong = Integer.parseInt(view.txtSoLuong.getText());
            if (masach.equals("")||tensach.equals("")||nhaxb.equals("")||view.nxb.equals("")||view.txtgia.equals("")||view.txtSoLuong.equals("")){
                view.showMessage("Vui lòng điền đầy đủ thông tin");
            }else {
                Sach_ThuVien sach = new Sach_ThuVien(masach,tensach,namxb,nhaxb,gia,soluong);
                Boolean success = sachDAO.addSach(sach);
                if (success){
                    view.showMessage("Thêm Thành Công");
                    sachDAO.hienThiSach();
                }else {
                    view.showMessage("Thêm Thất bại");
                }
            }


        }
    }
    class XoaActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    class Thoat1ActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            View_DangNhap viewDangNhap = new View_DangNhap();
            DNControl dnControl = new DNControl(viewDangNhap);
            viewDangNhap.setVisible(true);
            view.dispose();

        }
    }
    class TKActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
    class TroLaiActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int Exit = JOptionPane.showConfirmDialog(view, "Bạn có muốn rời khỏi trang?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (Exit != JOptionPane.YES_OPTION) {return;}
            view.dispose();
            View_ThuVien viewThuVien = new View_ThuVien();
            TVcontrol tVcontrol = new TVcontrol(viewThuVien);
            viewThuVien.setVisible(true);
        }
    }
    class ResetActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            reset();
        }
    }
    public void reset(){
        View_TTSach.ms.setText("");
        View_TTSach.ts.setText("");
        View_TTSach.nxb.setText("");
        View_TTSach.nnxb.setText("");
        View_TTSach.txtgia.setText("");
        View_TTSach.txtSoLuong.setText("");
        View_TTSach.txtTk.setText("");
    }
}
