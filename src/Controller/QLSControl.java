package Controller;

import Model.SachDAO;
import Model.SachTableModel;
import Model.Sach_ThuVien;
import View.View_DangNhap;
import View.View_TTSach;
import View.View_ThuVien2;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;
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
    private void showDL(){// xu???t ra t???t c??? d??? li???u
        List<Sach_ThuVien> data = sachDAO.hienThiSach();
        //tableModel = new MTTableModel();
        tableModel.setData(data);
    }
    private void showDL(List<Sach_ThuVien> sach){//xu???t ra d??? li???u ???? l???c
        tableModel.setData(sach);
    }
    class Print1ActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fc = new JFileChooser();//JFileChooser trong java l?? m???t ?????i t?????ng hi???n th??? khung cho ph??p b???n m??? ho???c l??u file
            fc.setDialogTitle("L??u T???p");//t??n ti??u ?????
            int userSelection = fc.showSaveDialog(view);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File filetosave = fc.getSelectedFile();
                try {
                    FileWriter fw = new FileWriter(filetosave);//L???p FileWriter ???????c s??? d???ng ????? ghi c??c d??? li???u theo ?????nh d???ng k?? t??? v??o m???t file
                    BufferedWriter bw = new BufferedWriter(fw);//L???p BufferedWriter ???????c s??? d???ng ????? cung c???p b??? ?????m cho c??c c??c th??? hi???n c???a l???p Writer
                    for (int i = 0; i < view.jTable2.getRowCount(); i++) {
                        for (int j = 0; j < view.jTable2.getColumnCount(); j++) {
                            bw.write(view.jTable2.getValueAt(i, j).toString());
                        }
                        bw.newLine();
                    }
                    JOptionPane.showMessageDialog(view, "Th??nh C??ng ", "Th??ng Tin", JOptionPane.INFORMATION_MESSAGE);
                    bw.close();
                    fw.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(view, "Error", "Error message", JOptionPane.ERROR_MESSAGE);
                }
            }
            System.out.println("Print1 duoc bam");
        }
    }
    class SuaActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int select = view.jTable2.getSelectedRow();
            if(select >= 0){
                Sach_ThuVien sach = view.getSach();
                sachDAO.updateSach(sach);
                showDL();
            }else {
                view.showMessage("B???n ch??a ch???n s??ch ????? s???a th??ng tin");
            }

        }
    }
    class ThemActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String masach = view.ms.getText();
            String tensach = view.ts.getText();
            String nhaxb = view.nnxb.getText();
            String namxb1 = view.nxb.getText();
            String gia1 = view.txtgia.getText();
            String soluong1 = view.txtSoLuong.getText();
            String reg = "\\d+";
            Calendar instance = Calendar.getInstance();
            int year = instance.get(Calendar.YEAR);
            int th = JOptionPane.showConfirmDialog(view, "B???n c?? mu???n th??m", "Confirm", JOptionPane.YES_NO_OPTION);
            if (th != JOptionPane.YES_OPTION) {
                return;
            }else {
                if (masach.equals("")||tensach.equals("")||nhaxb.equals("")||namxb1.isEmpty()||gia1.isEmpty()||soluong1.isEmpty()){
                    view.showMessage("Vui l??ng ??i???n ?????y ????? th??ng tin");
                }else {
                    if (sachDAO.checkMasach(masach)){
                        if(namxb1.matches(reg)&& gia1.matches(reg)&&soluong1.matches(reg)){
                            int  namxb = Integer.parseInt(view.nxb.getText());
                            int gia = Integer.parseInt(view.txtgia.getText());
                            int soluong = Integer.parseInt(view.txtSoLuong.getText());
                            if (namxb<=year){
                                Sach_ThuVien sach = new Sach_ThuVien(masach,tensach,namxb,nhaxb,gia,soluong);
                                Boolean success = sachDAO.addSach(sach);
                                if (success){
                                    view.showMessage("Th??m Th??nh C??ng");
                                    showDL();
                                    reset();
                                }else {
                                    view.showMessage("Th??m Th???t b???i");
                                }
                            }else {
                                view.showMessage("N??m xu???t b???n l???n h??n n??m hi???n t???i, vui l??ng nh???p l???i");
                            }
                        }else {
                            view.showMessage("Nh???p sai ?????nh d???ng d??? li???u, vui l??ng nh???p l???i");
                        }
                    }else {
                        view.showMessage("M?? S??ch b??? tr??ng, vui l??ng nh???p l???i");
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
                Sach_ThuVien sach = view.getSach();
                sachDAO.deleteSach(sach);
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
            String tenSach = view.txtTk.getText();
            showDL(sachDAO.timKiem(tenSach));
        }
    }
    class TroLaiActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int Exit = JOptionPane.showConfirmDialog(view, "B???n c?? mu???n r???i kh???i trang?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (Exit != JOptionPane.YES_OPTION) {return;}
            view.dispose();
            View_ThuVien2 viewThuVien = new View_ThuVien2();
            TV2control tVcontrol = new TV2control(viewThuVien);
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
