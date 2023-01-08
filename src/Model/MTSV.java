package Model;

import java.sql.Date;

public class MTSV {
    String MASACH;
    String TENSACH;
    int GIA;
    int SOLUONG;
    Date NGAYMUON;
    Date NGAYTRA;

    public MTSV(String MASACH, String TENSACH, int GIA, int SOLUONG, Date NGAYMUON, Date NGAYTRA){
        this.MASACH = MASACH;
        this.TENSACH = TENSACH;
        this.GIA = GIA;
        this.SOLUONG = SOLUONG;
        this.NGAYMUON = NGAYMUON;
        this.NGAYTRA = NGAYTRA;
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

    public int getGIA() {
        return GIA;
    }

    public void setGIA(int GIA) {
        this.GIA = GIA;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public Date getNGAYMUON() {
        return NGAYMUON;
    }

    public void setNGAYMUON(Date NGAYMUON) {
        this.NGAYMUON = NGAYMUON;
    }

    public Date getNGAYTRA() {
        return NGAYTRA;
    }

    public void setNGAYTRA(Date NGAYTRA) {
        this.NGAYTRA = NGAYTRA;
    }
}
