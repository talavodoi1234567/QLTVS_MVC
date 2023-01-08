package Controller;

import Model.*;
import View.View_ThongKe;
import View.View_ThuVien2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

public class TKController {
    View_ThongKe view;
    ThongKeDAO thongKeDAO = new ThongKeDAO();
    private TSMTableModel tsmTableModel = new TSMTableModel();
    private STMTableModel stmTableModel = new STMTableModel();
    private MTSVTableModel mtsvTableModel = new MTSVTableModel();
    private MTTTableModel mttTableModel = new MTTTableModel();
    public TKController(View_ThongKe view){
        this.view = view;
        view.settblMTSVTableModel(mtsvTableModel);
        view.settblMTTTableModel(mttTableModel);
        view.settblSTMTableModel(stmTableModel);
        view.settblTSMTableModel(tsmTableModel);
        showSVtraSachTre();
        showSachTraTre();
        showMTTT(1,2022);
        view.TKSVtraSachTre(new TKSVtraSachTreActionListener());
        view.TKSachTraTre(new TKSachTraTreActionListener());
        view.TKMuonTheoThang(new TKMuonTheoThangActionListener());
        view.TKSachMuonTheoSV(new TKMuonTheoSVActionListener());
        view.troLaiActionPerformed(new troLaiActionListener());
        view.thoatActionPerformed(new thoatActionListener());
        view.cbbThangChangeListener(new ThayDoiThangNam());
        view.cbbNamChangeListener(new ThayDoiThangNam());
        view.btnSearchActionListener(new ThongKeMuonTheoSV());
    }
    public void showSVtraSachTre(){
        List<TSM> data = thongKeDAO.TKTSM();
        tsmTableModel.setData(data);
    }
    public void showSachTraTre(){
        List<STM> data = thongKeDAO.TKSTM();
        stmTableModel.setData(data);
    }
    public void showMTSV(String msv){
        List<MTSV> data = thongKeDAO.TKMTSV(msv);
        mtsvTableModel.setData(data);
    }
    public void showMTTT(int thang, int nam){
        List<MuonTra_ThuVien> data = thongKeDAO.TKMTTT(thang, nam);
        mttTableModel.setData(data);
    }
    class TKSVtraSachTreActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.SVTraSachTre.setVisible(true);
            view.LuotMuonThang.setVisible(false);
            view.SachTreHen.setVisible(false);
            view.SachmuontheoSV.setVisible(false);
        }
    }
    class TKSachTraTreActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.SVTraSachTre.setVisible(false);
            view.LuotMuonThang.setVisible(false);
            view.SachTreHen.setVisible(true);
            view.SachmuontheoSV.setVisible(false);
        }
    }
    class TKMuonTheoThangActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.SVTraSachTre.setVisible(false);
            view.LuotMuonThang.setVisible(true);
            view.SachTreHen.setVisible(false);
            view.SachmuontheoSV.setVisible(false);
        }
    }

    class TKMuonTheoSVActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.SVTraSachTre.setVisible(false);
            view.LuotMuonThang.setVisible(false);
            view.SachTreHen.setVisible(false);
            view.SachmuontheoSV.setVisible(true);
        }
    }
    class troLaiActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            View_ThuVien2 viewTV2 = new View_ThuVien2();
            TV2control control = new TV2control(viewTV2);
            viewTV2.setVisible(true);
            view.dispose();
        }
    }
    class thoatActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    class ThayDoiThangNam implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange()==ItemEvent.SELECTED){
                int thang = view.thang.getSelectedIndex() + 1;
                int nam = view.nam.getSelectedIndex() + 2022;
                List<MuonTra_ThuVien> data = thongKeDAO.TKMTTT(thang, nam);
                mttTableModel.setData(data);
            }
        }
    }
    class ThongKeMuonTheoSV implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String msv = view.jTextField1.getText();
            List<MTSV> data = thongKeDAO.TKMTSV(msv);
            mtsvTableModel.setData(data);
        }
    }
}
