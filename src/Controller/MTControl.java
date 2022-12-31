package Controller;

import Model.MTTableModel;
import Model.MuonTraDAO;
import Model.MuonTra_ThuVien;
import View.View_QLMuonTra;

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
        List<MuonTra_ThuVien> mttv = mtdao.hienthiMT();
        view.setTableModel(tableModel);
        tableModel.setData(mttv);
        addChonSach();
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
    private void showDL(){
        List<MuonTra_ThuVien> data = mtdao.hienthiMT();
        tableModel.setRowCount(0);
        for (MuonTra_ThuVien mttv: data){
            tableModel.addRow(new Object[]{mttv.getMSV(), mttv.getMASACH(), mttv.getNGAYMUON(),
                    mttv.getNGAYTRA(), mttv.getSOLUONG(), mttv.getQLTHUVIEN()});
        }
    }
    class ChoMuonActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String msv = view.txtMsv.getText();
            String ms = view.txtms.getText();
            Date nm = new java.sql.Date(view.txtNm.getDate().getTime());
            Date nt = new java.sql.Date(view.txtNt.getDate().getTime());
            int sl = Integer.parseInt(view.txtSl.getText());
            String qltv = view.txtQltv.getText();
            MuonTra_ThuVien mttv_new = new MuonTra_ThuVien(msv, ms, nm, nt, sl, qltv);
            mtdao.addMT(mttv_new);
            //showDL();
        }
    }
    class MuonMoiActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.txtMsv.setText("");
            view.txtms.setText("");
            view.txtNm.setDate(new java.util.Date());
            view.txtNt.setDate(null);
            view.txtSl.setText("");
            view.txtQltv.setText("");
        }
    }
    class PintActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Pint duoc bam");
        }
    }
    class ThoatActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Thoat duoc bam");
        }
    }
    class TkActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("TK duoc bam");
        }
    }
    class TraSachActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Tra sach duoc bam");
        }
    }
    class thoat1ActionPerformed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("thoat1 duoc bam");
        }
    }
}
