package Model;

import java.sql.Date;

public class NhanVien_ThuVien {
    String MaTT,HVT;
    Date ns;
    String gt,diachi, email,user, pass;
    public NhanVien_ThuVien(){
    }

    public NhanVien_ThuVien(String maTT, String HVT, Date ns, String gt, String diachi, String email, String user, String pass) {
        MaTT = maTT;
        this.HVT = HVT;
        this.ns = ns;
        this.gt = gt;
        this.diachi = diachi;
        this.email = email;
        this.user = user;
        this.pass = pass;
    }

    public NhanVien_ThuVien(String maTT, String HVT, Date ns, String gt, String diachi, String email, String user) {
        MaTT = maTT;
        this.HVT = HVT;
        this.ns = ns;
        this.gt = gt;
        this.diachi = diachi;
        this.email = email;
        this.user = user;
    }

    public String getMaTT() {
        return MaTT;
    }

    public void setMaTT(String maTT) {
        MaTT = maTT;
    }

    public String getHVT() {
        return HVT;
    }

    public void setHVT(String HVT) {
        this.HVT = HVT;
    }

    public Date getNs() {
        return ns;
    }

    public void setNs(Date ns) {
        this.ns = ns;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
