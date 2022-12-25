package Model;

public class Sach_ThuVien {
    String MASACH,TENSACH;
    int NAMXB;
    String NHAXB;
    int GIA;
    int SOLUONG;

    public Sach_ThuVien() {
    }

    public Sach_ThuVien(String MASACH, String TENSACH, int NAMXB, String NHAXB, int GIA, int SOLUONG) {
        this.MASACH = MASACH;
        this.TENSACH = TENSACH;
        this.NAMXB = NAMXB;
        this.NHAXB = NHAXB;
        this.GIA = GIA;
        this.SOLUONG = SOLUONG;
    }

    public String getMASACH() {
        return MASACH;
    }

    public void setMASACH(String MASACH) {
        this.MASACH = MASACH;
    }

    public String getTENSACH() {
        return TENSACH;
    }

    public void setTENSACH(String TENSACH) {
        this.TENSACH = TENSACH;
    }

    public int getNAMXB() {
        return NAMXB;
    }

    public void setNAMXB(int NAMXB) {
        this.NAMXB = NAMXB;
    }

    public String getNHAXB() {
        return NHAXB;
    }

    public void setNHAXB(String NHAXB) {
        this.NHAXB = NHAXB;
    }

    public int getGIA() {
        return GIA;
    }

    public void setGIA(int GIA) {
        this.GIA = GIA;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }
}
    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }
}

