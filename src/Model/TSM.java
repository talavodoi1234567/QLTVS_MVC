package Model;

public class TSM {
    String MSV;
    int SOLUONG;
    public TSM(String MSV, int SOLUONG){
        this.MSV = MSV;
        this.SOLUONG = SOLUONG;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getMSV() {
        return MSV;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }
}
