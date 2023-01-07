package Controller;

import Model.TKDAO;
import View.View_DangNhap;
import View.View_ThuVien2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DNControl {
   private View_DangNhap view;
   private TKDAO tkdao;
    public DNControl(View_DangNhap view) {
        this.view = view;
        tkdao = new TKDAO();
        view.AddbtndangnhapActionPerformed(new AddLoginListener());
       // view.AddbtnThemTkActionPerformed(new AddSignupListener());

    }
    class AddLoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String user = view.txtusername.getText();
            String pass = view.jfpwd.getText();
            String phanquyen = view.jComboBox2.getSelectedItem().toString();
        if(user.equals("")||pass.equals("")){
            view.showMessage("Vui lòng điền đẩy đủ các thông tin");
        }else
        {     Boolean success =  tkdao.login(user,pass,phanquyen);
              if(success) {
                  view.showMessage("Đăng nhập thành công");
                      View_ThuVien2 viewThuVien2 = new View_ThuVien2();
                      viewThuVien2.setVisible(true);
                      //view.setVisible(false);
                      view.dispose();
                      TV2control tVcontrol = new TV2control(viewThuVien2);
              } else
              {
                  view.showMessage("Đăng nhập thất bại");
              }

        }
        }
    }

}
