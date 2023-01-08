package Controller;

import Model.ThongKeDAO;
import View.View_ThongKe;

import javax.swing.text.View;

public class TKController {
    View_ThongKe view;
    ThongKeDAO thongKeDAO = new ThongKeDAO();
    public TKController(View_ThongKe view){
        this.view = view;
        //view.addActionListener();
    }
}
