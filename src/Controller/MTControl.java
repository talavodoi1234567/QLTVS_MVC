package Controller;

import Model.MTTableModel;
import Model.MuonTraDAO;
import Model.MuonTra_ThuVien;
import View.View_DangNhap;
import View.View_QLMuonTra;
import View.View_ThuVien2;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private void showDL(){// xu???t ra t???t c??? d??? li???u
        List<MuonTra_ThuVien> data = mtdao.hienthiMT();
        //tableModel = new MTTableModel();
        tableModel.setData(data);
    }
    private void showDL(List<MuonTra_ThuVien> mttv){//xu???t ra d??? li???u ???? l???c
        tableModel.setData(mttv);
    }
    class ChoMuonActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            MuonTra_ThuVien mt = view.getMT();
            boolean b = mtdao.addMT(mt);
            if (b) JOptionPane.showMessageDialog(view, "Th??m th??nh c??ng");
            else JOptionPane.showMessageDialog(view, "Th??m th???t b???i");
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
        //n??t ????? xu???t ra file txt
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
    class ThoatActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // th??m x??c nh???n
            int m = JOptionPane.showConfirmDialog(view, "B???n c?? mu???n tr??? l???i?", "X??c nh???n", JOptionPane.YES_NO_OPTION);
            if (m == JOptionPane.YES_OPTION) {
                View_ThuVien2 viewThuVien = new View_ThuVien2();
                TV2control tVcontrol = new TV2control(viewThuVien);
                viewThuVien.setVisible(true);
                view.dispose();
            }
        }
    }
    class TkActionPerformed implements ActionListener{
        //ch??? t??m theo msv v?? m?? s??ch
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
            if (b) JOptionPane.showMessageDialog(view, "Tr??? th??nh c??ng");
            else JOptionPane.showMessageDialog(view, "Tr??? th???t b???i");
            showDL();
        }
    }
    class thoat1ActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int m = JOptionPane.showConfirmDialog(view, "B???n c?? mu???n tho??t?", "X??c nh???n", JOptionPane.YES_NO_OPTION);
            if (m == JOptionPane.YES_OPTION) {
                View_DangNhap viewDangNhap = new View_DangNhap();
                DNControl dnControl = new DNControl(viewDangNhap);
                viewDangNhap.setVisible(true);
                view.dispose();
            }
        }
    }
}
