package Controller;

import Model.MuonTra_ThuVien;
import Model.SachDAO;
import Model.SachTableModel;
import Model.Sach_ThuVien;
import View.View_DangNhap;
import View.View_TTSach;
import View.View_ThuVien;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;

public class QLSControl {
    private View_TTSach view;
    private SachDAO sachDAO = new SachDAO();
    private SachTableModel tableModel = new SachTableModel();
    public QLSControl (View_TTSach view){
        this.view= view;
        view.setTableModel(tableModel);
        addChonSach();
        showDL();
        view.BtnPrint1ActionPerformed(new Print1ActionListener());
        view.BtnSuaActionPerformed(new SuaActionListener());
        view.BtnThemActionPerformed(new ThemActionListener());
        view.BtnThoatActionPerformed(new Thoat1ActionListener());
        view.BtnTkActionPerformed(new TKActionListener());
        view.BtnTrolaiActionPerformed(new TroLaiActionListener());
        view.BtnXoaActionPerformed(new XoaActionListener());
        view.BtnResetActionPerformed(new ResetActionListener());
    }
    public void addChonSach(){
        try{
            view.jTable2.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    int selectedRow = view.jTable2.getSelectedRow();
                    if (selectedRow>=0){
                        view.ms.setText(view.jTable2.getValueAt(selectedRow,0)+"");
                        view.ts.setText(view.jTable2.getValueAt(selectedRow,1)+"");
                        view.nxb.setText(view.jTable2.getValueAt(selectedRow,2)+"");
                        view.nnxb.setText(view.jTable2.getValueAt(selectedRow,3)+"");
                        view.txtgia.setText(view.jTable2.getValueAt(selectedRow,4)+"");
                        view.txtSoLuong.setText(view.jTable2.getValueAt(selectedRow,5)+"");
                        }
                    }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void showDL(){// xuất ra tất cả dữ liệu
        List<Sach_ThuVien> data = sachDAO.hienThiSach();
        //tableModel = new MTTableModel();
        tableModel.setData(data);
    }
    private void showDL(List<Sach_ThuVien> sach){//xuất ra dữ liệu đã lọc
        tableModel.setData(sach);
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
        view.ms.setText("");
        view.ts.setText("");
        view.nxb.setText("");
        view.nnxb.setText("");
        view.txtgia.setText("");
        view.txtSoLuong.setText("");
        view.txtTk.setText("");
    }
}
