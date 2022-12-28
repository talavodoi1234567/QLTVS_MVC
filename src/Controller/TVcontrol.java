package Controller;

import View.View_DangNhap;
import View.View_QLMuonTra;
import View.View_TTSach;
import View.View_ThuVien;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TVcontrol {
    View_ThuVien view;
    public TVcontrol(View_ThuVien view){
        this.view= view;
        view.QLMActionPerformed(new QLMActionListener());
        view.QLSActionPerformed(new QLSActionListener());
        view.ThoatActionPerformed(new ThoatActionListener());
    }
    class QLMActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            View_QLMuonTra viewQlMuonTra = new View_QLMuonTra();
            viewQlMuonTra.setVisible(true);
            view.dispose();

        }
    }
    class QLSActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            View_TTSach viewTtSach = new View_TTSach();
            viewTtSach.setVisible(true);
            view.dispose();
        }
    }
    class ThoatActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            View_DangNhap viewDangNhap = new View_DangNhap();
            DNControl dnControl = new DNControl(viewDangNhap);
            viewDangNhap.setVisible(true);
            view.dispose();
        }
    }

}
