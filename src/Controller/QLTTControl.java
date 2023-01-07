package Controller;

import Model.*;
import View.View_DangNhap;
import View.View_QLThuThu;
import View.View_ThuVien2;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class QLTTControl {
    private View_QLThuThu view;
    private NhanVienDao nhanVienDao = new NhanVienDao();
    private TTTableModel tableModel1 = new TTTableModel();
    public QLTTControl(View_QLThuThu view) {
        this.view = view;
        view.setTableModel(tableModel1);
        addChonNhanVien();
        showDL();
        view.BtnSuaActionPerformed(new QLTTControl.SuaActionListener());
        view.BtnThemActionPerformed(new QLTTControl.ThemActionListener());
        view.BtnThoatActionPerformed(new QLTTControl.Thoat1ActionListener());
        view.BtnTkActionPerformed(new QLTTControl.TKActionListener());
        view.BtnTrolaiActionPerformed(new QLTTControl.TroLaiActionListener());
        view.BtnXoaActionPerformed(new QLTTControl.XoaActionListener());
        view.BtnResetActionPerformed(new QLTTControl.ResetActionListener());
    }
    public void addChonNhanVien(){
        try{
            view.jTable2.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    int selectedRow = view.jTable2.getSelectedRow();
                    if (selectedRow>=0){
                        view.mtt.setText(view.jTable2.getValueAt(selectedRow,0)+"");
                        view.hvt.setText(view.jTable2.getValueAt(selectedRow,1)+"");
                        String ns = view.jTable2.getValueAt(selectedRow,2)+"";
                        String gt = view.jComboBox1.getSelectedItem().toString();
                        gt = view.jTable2.getValueAt(selectedRow,3)+"";
                        view.diachi.setText(view.jTable2.getValueAt(selectedRow,4)+"");
                        view.email.setText(view.jTable2.getValueAt(selectedRow,5)+"");
                    }
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void showDL(){// xuất ra tất cả dữ liệu
        List<NhanVien_ThuVien> data = nhanVienDao.hienThiNhanVien();
        //tableModel = new MTTableModel();
        tableModel1.setData(data);
    }
    private void showDL(List<NhanVien_ThuVien> nhanvien){//xuất ra dữ liệu đã lọc
        tableModel1.setData(nhanvien);
    }
    class SuaActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int select = view.jTable2.getSelectedRow();
            if(select >= 0){
                NhanVien_ThuVien nhanvien = view.getNhanVien();
                nhanVienDao.updateNhanVien(nhanvien);
                showDL();
            }else {
                view.showMessage("Bạn chưa chọn nhân viên để sửa thông tin");
            }

        }
    }
    class ThemActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
//            String masach = view.ms.getText();
//            String tensach = view.ts.getText();
//            String nhaxb = view.nnxb.getText();
//            String namxb1 = view.nxb.getText();
//            String gia1 = view.txtgia.getText();
//            String soluong1 = view.txtSoLuong.getText();
//            String reg = "\\d+";
//            Calendar instance = Calendar.getInstance();
//            int year = instance.get(Calendar.YEAR);
//            int th = JOptionPane.showConfirmDialog(view, "Bạn có muốn thêm", "Confirm", JOptionPane.YES_NO_OPTION);
//            if (th != JOptionPane.YES_OPTION) {
//                return;
//            }else {
//                if (masach.equals("")||tensach.equals("")||nhaxb.equals("")||namxb1.isEmpty()||gia1.isEmpty()||soluong1.isEmpty()){
//                    view.showMessage("Vui lòng điền đầy đủ thông tin");
//                }else {
//                    if (sachDAO.checkMasach(masach)){
//                        if(namxb1.matches(reg)&& gia1.matches(reg)&&soluong1.matches(reg)){
//                            int  namxb = Integer.parseInt(view.nxb.getText());
//                            int gia = Integer.parseInt(view.txtgia.getText());
//                            int soluong = Integer.parseInt(view.txtSoLuong.getText());
//                            if (namxb<=year){
//                                Sach_ThuVien sach = new Sach_ThuVien(masach,tensach,namxb,nhaxb,gia,soluong);
//                                Boolean success = sachDAO.addSach(sach);
//                                if (success){
//                                    view.showMessage("Thêm Thành Công");
//                                    showDL();
//                                    reset();
//                                }else {
//                                    view.showMessage("Thêm Thất bại");
//                                }
//                            }else {
//                                view.showMessage("Năm xuất bản lớn hơn năm hiện tại, vui lòng nhập lại");
//                            }
//                        }else {
//                            view.showMessage("Nhập sai định dạng dữ liệu, vui lòng nhập lại");
//                        }
//                    }else {
//                        view.showMessage("Mã Sách bị trùng, vui lòng nhập lại");
//                    }
//                }
//            }
        }
    }
    class XoaActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
//            int select = view.jTable2.getSelectedRow();//lấy ra dòng được chọn
//            if (select>=0){
//                int th = JOptionPane.showConfirmDialog(view, "Bạn chắc chắn muốn xóa?", "Confirm", JOptionPane.YES_NO_OPTION);
//                if (th != JOptionPane.YES_OPTION) {
//                    return;
//                }
//                Sach_ThuVien sach = view.getSach();
//                sachDAO.deleteSach(sach);
//                reset();
//                showDL();
//                view.showMessage("Xóa thành công");
//            }else {
//                view.showMessage("Bạn chưa chọn sách để xóa");
//            }
//

        }
    }
    class Thoat1ActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int th = JOptionPane.showConfirmDialog(view, "Bạn chắc chắn muốn thoát?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (th != JOptionPane.YES_OPTION) {
                return;
            } else {
                View_DangNhap viewDangNhap = new View_DangNhap();
                DNControl dnControl = new DNControl(viewDangNhap);
                viewDangNhap.setVisible(true);
                view.dispose();
            }


        }
    }
    class TKActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String Matt = view.txtTk.getText();
            showDL(nhanVienDao.timKiem(Matt));
        }
    }
    class TroLaiActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int Exit = JOptionPane.showConfirmDialog(view, "Bạn có muốn rời khỏi trang?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (Exit != JOptionPane.YES_OPTION) {return;}
            view.dispose();
            View_ThuVien2 viewThuVien2 = new View_ThuVien2();
            TV2control tVcontrol = new TV2control(viewThuVien2);
            viewThuVien2.setVisible(true);
        }
    }
    class ResetActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            reset();
        }
    }
    public void reset(){
        view.mtt.setText("");
        view.hvt.setText("");
        view.ns.setDate(null);
        view.diachi.setText("");
        view.email.setText("");
        view.txtuser.setText("");
        view.txtpass.setText("");
        view.txtTk.setText("");
    }

}
