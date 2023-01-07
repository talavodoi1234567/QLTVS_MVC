package Controller;

import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TV2control {
    View_ThuVien2 view;
    public TV2control(View_ThuVien2 view){
        this.view= view;
        view.QLmActionPerformed(new QLMActionListener());
        view.QlsActionPerformed(new QLSActionListener());
        view.ThoatActionPerformed(new ThoatActionListener());
        view.QltkActionPerformed(new QLTKActionListener());
        view.QlttActionPerformed(new QLTTActionListener());
    }
    class QLMActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            View_QLMuonTra viewQlMuonTra = new View_QLMuonTra();
            MTControl mtControl = new MTControl(viewQlMuonTra);
            viewQlMuonTra.setVisible(true);
            view.dispose();
        }
    }
    class QLSActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            View_TTSach viewTtSach = new View_TTSach();
            QLSControl qlsControl = new QLSControl(viewTtSach);
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
    class QLTKActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {


        }
    }
    class QLTTActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            View_QLThuThu viewQlThuThu = new View_QLThuThu();
            QLTTControl qlttControl = new QLTTControl(viewQlThuThu);
            viewQlThuThu.setVisible(true);
            view.dispose();
        }
    }

}
