package Model;

public class STM {
    String MASACH;
    String TENSACH;
    int GIA;
    int SOLUONG;
    public STM(String MASACH, String TENSACH, int GIA, int SOLUONG){
        this.MASACH = MASACH;
        this.TENSACH = TENSACH;
        this.GIA = GIA;
        this.SOLUONG = SOLUONG;
    }

    public String getMASACH() {
        return MASACH;
    }

    public void setMASACH(String MASACH) {
        this.MASACH = MASACH;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public int getGIA() {
        return GIA;
    }

    public void setGIA(int GIA) {
        this.GIA = GIA;
    }

    public String getTENSACH() {
        return TENSACH;
    }

    public void setTENSACH(String TENSACH) {
        this.TENSACH = TENSACH;
    }
}
