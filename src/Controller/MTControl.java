package Controller;

import Model.MTTableModel;
import Model.MuonTraDAO;
import Model.MuonTra_ThuVien;
import View.View_QLMuonTra;
import View.View_ThuVien;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.List;

public class MTControl {
    private View_QLMuonTra view;
    private MuonTraDAO mtdao;
    private MTTableModel tableModel;
    public MTControl(View_QLMuonTra view){
        this.view = view;
        this.mtdao = new MuonTraDAO();
        this.tableModel = new MTTableModel();
        view.setTableModel(tableModel);
//        List<MuonTra_ThuVien> mttv = mtdao.hienthiMT();
//        tableModel.setData(mttv)
        addChonSach();
        showDL();
        view.btnChomuonActionPerformed(new ChoMuonActionPerformed());
        view.btnMuonmoiActionPerformed(new MuonMoiActionPerformed());
        view.btnPintActionPerformed(new PintActionPerformed());
        view.btnThoatActionPerformed(new ThoatActionPerformed());
        view.btnTkActionPerformed(new TkActionPerformed());
        view.btnTrasachActionPerformed(new TraSachActionPerformed());
        view.btnthoat1ActionPerformed(new thoat1ActionPerformed());
        view.setVisible(true);
    }
    public void addChonSach(){
        try{
            view.tabMuontra.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    int selectedRow = view.tabMuontra.getSelectedRow();
                    if (selectedRow>=0){
                        view.txtMsv.setText(view.tabMuontra.getValueAt(selectedRow,0)+"");
                        view.txtms.setText(view.tabMuontra.getValueAt(selectedRow,1)+"");
                        String nm = view.tabMuontra.getValueAt(selectedRow,2)+"";
                        String nt = view.tabMuontra.getValueAt(selectedRow,3)+"";
                        view.txtSl.setText(view.tabMuontra.getValueAt(selectedRow,4)+"");
                        view.txtQltv.setText(view.tabMuontra.getValueAt(selectedRow,5)+"");
                        try {
                            java.util.Date nm_date = new SimpleDateFormat("yyyy-MM-dd").parse(nm);
                            java.util.Date nt_date = new SimpleDateFormat("yyyy-MM-dd").parse(nt);
                            view.txtNm.setDate(nm_date);
                            view.txtNt.setDate(nt_date);
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
    private void showDL(){// xuất ra tất cả dữ liệu
        List<MuonTra_ThuVien> data = mtdao.hienthiMT();
        //tableModel = new MTTableModel();
        tableModel.setData(data);
    }
    private void showDL(List<MuonTra_ThuVien> mttv){//xuất ra dữ liệu đã lọc
        tableModel.setData(mttv);
    }
    class ChoMuonActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            MuonTra_ThuVien mt = view.getMT();
            boolean b = mtdao.addMT(mt);
            if (b) JOptionPane.showMessageDialog(view, "Thêm thành công");
            else JOptionPane.showMessageDialog(view, "Thêm thất bại");
            showDL();
        }
    }
    class MuonMoiActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.txtMsv.setText("");
            view.txtms.setText("");
            view.txtNm.setDate(null);
            view.txtNt.setDate(null);
            view.txtSl.setText("0");
            view.txtQltv.setText("");
        }
    }
    class PintActionPerformed implements ActionListener{
        //nút để xuất ra file txt
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
    class ThoatActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // thêm xác nhận
            int m = JOptionPane.showConfirmDialog(view, "Bạn có muốn trở lại?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (m == JOptionPane.YES_OPTION) {
                View_ThuVien viewThuVien = new View_ThuVien();
                TVcontrol tVcontrol = new TVcontrol(viewThuVien);
                viewThuVien.setVisible(true);
                view.dispose();
            }
        }
    }
    class TkActionPerformed implements ActionListener{
        //chỉ tìm theo msv và mã sách
        @Override
        public void actionPerformed(ActionEvent e) {
            String msv = view.txtMsv.getText();
            String ms = view.txtms.getText();
            showDL(mtdao.searchMT(msv, ms));
        }
    }
    class TraSachActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            MuonTra_ThuVien mt = view.getMT();
            boolean b = mtdao.deleteMT(mt);
            if (b) JOptionPane.showMessageDialog(view, "Trả thành công");
            else JOptionPane.showMessageDialog(view, "Trả thất bại");
            showDL();
        }
    }
    class thoat1ActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int m = JOptionPane.showConfirmDialog(view, "Bạn có muốn thoát?","Xác nhận", JOptionPane.YES_NO_OPTION);
            if (m == JOptionPane.YES_OPTION)
                System.exit(0);
        }
    }
}
