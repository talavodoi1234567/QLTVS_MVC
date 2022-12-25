package Model;

public class MuonTra_ThuVien extends Sach_ThuVien {
    String MSV;
    String MASACH;
    String NGAYMUON, NGAYTRA;
    int SOLUONG;
    String QLTHUVIEN;

    public MuonTra_ThuVien() {
    }
    public MuonTra_ThuVien(String MSV, String MASACH, String NGAYMUON, String NGAYTRA, int SOLUONG, String QLTHUVIEN) {
        this.MSV = MSV;
        this.MASACH = MASACH;
        this.NGAYMUON = NGAYMUON;
        this.NGAYTRA = NGAYTRA;
        this.SOLUONG = SOLUONG;
        this.QLTHUVIEN = QLTHUVIEN;
    }
//dkmmmmmmmmmmmm!!!!!!!!
    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getMASACH() {
        return MASACH;
    }

    public void setMASACH(String MASACH) {
        this.MASACH = MASACH;
    }

    public String getNGAYMUON() {
        return NGAYMUON;
    }

    public void setNGAYMUON(String NGAYMUON) {
        this.NGAYMUON = NGAYMUON;
    }

    public String getNGAYTRA() {
        return NGAYTRA;
    }

    public void setNGAYTRA(String NGAYTRA) {
        this.NGAYTRA = NGAYTRA;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public String getQLTHUVIEN() {
        return QLTHUVIEN;
    }

    public void setQLTHUVIEN(String QLTHUVIEN) {
        this.QLTHUVIEN = QLTHUVIEN;
    }

}

