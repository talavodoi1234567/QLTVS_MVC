package View;

import Controller.DNControl;

public class Main {
    public static void main(String[] args) {
        View_DangNhap view = new View_DangNhap();
        DNControl dnControl = new DNControl(view);
        view.setVisible(true);
    }
}
