package Controller;

import Model.NhanVienDao;
import Model.NhanVien_ThuVien;
import Model.TTTableModel;
import View.View_DangNhap;
import View.View_QLThuThu;
import View.View_ThuVien2;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;

import static java.util.Calendar.getInstance;

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
    String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
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
                        String gt = view.jTable2.getValueAt(selectedRow,3)+"";
                        if(gt.equals("Nam")){
                            view.jComboBox1.setSelectedIndex(0);
                        }else{
                            view.jComboBox1.setSelectedIndex(1);
                        }
                        view.diachi.setText(view.jTable2.getValueAt(selectedRow,4)+"");
                        view.email.setText(view.jTable2.getValueAt(selectedRow,5)+"");
                        view.txtuser.setText(view.jTable2.getValueAt(selectedRow,6)+"");
                        try {
                            java.util.Date ns_date = new SimpleDateFormat("yyyy-MM-dd").parse(ns);
                            view.ns.setDate(ns_date);
                        }catch (Exception ex){
                            ex.printStackTrace();
                        }
                    }
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void showDL(){// xu???t ra t???t c??? d??? li???u
        List<NhanVien_ThuVien> data = nhanVienDao.hienThiNhanVien();
        //tableModel = new MTTableModel();
        tableModel1.setData(data);
    }
    private void showDL(List<NhanVien_ThuVien> nhanvien){//xu???t ra d??? li???u ???? l???c
        tableModel1.setData(nhanvien);
    }
    class SuaActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int select = view.jTable2.getSelectedRow();
            if(select >= 0){
                NhanVien_ThuVien nhanvien = view.getNhanVien();
                nhanVienDao.updateNhanVien(nhanvien);
                view.showMessage("Ch???nh s???a th??nh c??ng");
                showDL();
            }else {
                view.showMessage("B???n ch??a ch???n nh??n vi??n ????? s???a th??ng tin");
            }

        }
    }
    class ThemActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String matt = view.mtt.getText();
            String hvt = view.hvt.getText();
            Date ns = new Date(view.ns.getDate().getTime());
            String gt = view.jComboBox1.getSelectedItem().toString();
            String diachi = view.diachi.getText();
            String email= view.email.getText();
            String user = view.txtuser.getText();
            String pass= view.txtpass.getText();
            String reg = "\\d+";
            java.util.Date date = new java.util.Date() ;
            int th = JOptionPane.showConfirmDialog(view, "B???n c?? mu???n th??m", "Confirm", JOptionPane.YES_NO_OPTION);
            if (th != JOptionPane.YES_OPTION) {
                return;
            }else {
                if (matt.equals("")||hvt.equals("")||diachi.equals("")||ns.equals(null)||email.isEmpty()||user.isEmpty()||pass.isEmpty()){
                    view.showMessage("Vui l??ng ??i???n ?????y ????? th??ng tin");
                }else {
                    if (nhanVienDao.checkMATT(matt)){
                        if(nhanVienDao.checkUser(user)){
                            if (patternMatches(email,regexPattern)){
                                if(!ns.after(date)) {
                                    NhanVien_ThuVien nhanvien = new NhanVien_ThuVien(matt,hvt,ns,gt,diachi,email,user,pass);
                                    Boolean success = nhanVienDao.addNhanVien(nhanvien);
                                    if (success){
                                        view.showMessage("Th??m Th??nh C??ng");
                                        showDL();
                                        reset();
                                    }else {
                                        view.showMessage("Th??m Th???t b???i");
                                    }
                                }else {
                                    view.showMessage("Ng??y Sinh kh??ng ????ng, vui l??ng ch???n l???i");
                                }

                            }else {
                                view.showMessage("Email kh??ng ????ng ?????nh d???ng, vui l??ng nh???p l???i");
                            }
                        }else {
                            view.showMessage("Username b??? tr??ng, vui l??ng nh???p l???i");
                        }
                    }else {
                        view.showMessage("M?? Th??? Th?? b??? tr??ng, vui l??ng nh???p l???i");
                    }
                }
            }
        }
    }
    class XoaActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int select = view.jTable2.getSelectedRow();//l???y ra d??ng ???????c ch???n
            if (select>=0){
                int th = JOptionPane.showConfirmDialog(view, "B???n ch???c ch???n mu???n x??a?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (th != JOptionPane.YES_OPTION) {
                    return;
                }
                String matt = (String) view.jTable2.getValueAt(select,0);
                //NhanVien_ThuVien nhanvien = view.getNhanVien();
                nhanVienDao.deleteNhanVien(matt);
                reset();
                showDL();
                view.showMessage("X??a th??nh c??ng");
            }else {
                view.showMessage("B???n ch??a ch???n s??ch ????? x??a");
            }


        }
    }
    class Thoat1ActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int th = JOptionPane.showConfirmDialog(view, "B???n ch???c ch???n mu???n tho??t?", "Confirm", JOptionPane.YES_NO_OPTION);
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
            int Exit = JOptionPane.showConfirmDialog(view, "B???n c?? mu???n r???i kh???i trang?", "Confirm", JOptionPane.YES_NO_OPTION);
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
