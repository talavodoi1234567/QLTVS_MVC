package Main;

import Controller.DNControl;
import View.View_DangNhap;

public class Main {
    public static void main(String[] args) {
        View_DangNhap view = new View_DangNhap();
        view.setVisible(true);
        DNControl dnControl= new DNControl(view);
    }
}
