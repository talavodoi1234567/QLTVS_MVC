package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class MuonTraDAO extends TKDAO {
    public List<MuonTra_ThuVien> hienthiMT() {
        List<MuonTra_ThuVien> ds = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM muontra";
        try {
            Statement selectStatement = con.createStatement();
            ResultSet rs = selectStatement.executeQuery(sql);
            while (rs.next()) {
                String msv = rs.getString("MASV");
                String maSach = rs.getString("MASACH");
                Date ngayMuon = rs.getDate("NGAYMUON");
                Date ngayTra = rs.getDate("NGAYTRA");
                int sl = rs.getInt("SOLUONG");
                String qltv = rs.getString("QLTHUVIEN");
                MuonTra_ThuVien mttv = new MuonTra_ThuVien(msv, maSach, ngayMuon, ngayTra, sl, qltv);
                ds.add(mttv);
            }
            //adsfasdfa
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(con);
        }
        return ds;
    }
    public boolean capnhatSL(String maSach, int soluong, boolean type){//type = 1: muon, 0: tra
        Connection con = getConnection();
        String sql = "SELECT soluong FROM sach where masach = '" + maSach + "'";
        int sl = 0;
        try{
            Statement selectStatement = con.createStatement();
            ResultSet rs = selectStatement.executeQuery(sql);
            if (rs.next()){
                sl = rs.getInt("soluong");
                if ((sl < soluong) && type) return false;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeConnection(con);
        }
        con = getConnection();
        sql = "UPDATE sach SET soluong = ? where masach = ?";
        try {
            PreparedStatement addStatement = con.prepareStatement(sql);
            if (type)
                addStatement.setInt(1,sl - soluong);
            else
                addStatement.setInt(1, sl + soluong);
            addStatement.setString(2, maSach);
            addStatement.executeUpdate();
            addStatement.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(con);
        }
        return false;
    }
    public int getSLMuon(String masv, String masach){
        Connection con = getConnection();
        String sql = "SELECT soluong FROM muontra WHERE masv = ? and masach = ?";
        int sl = 0;
        try{
            PreparedStatement getStatement = con.prepareStatement(sql);
            getStatement.setString(1, masv);
            getStatement.setString(2, masach);
            ResultSet rs = getStatement.executeQuery();
            if (rs.next()) {
                sl = rs.getInt("soluong");
            }
            return sl;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(con);
        }
        return 0;
    }
    public boolean addMT(MuonTra_ThuVien mttv) {
        Connection con = getConnection();
        String sql = "INSERT INTO `muontra`(`MASV`, `MASACH`, `NGAYMUON`, `NGAYTRA`, `SOLUONG`, `QLTHUVIEN`) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement addStatement = con.prepareStatement(sql);
            addStatement.setString(1, mttv.getMSV());
            addStatement.setString(2, mttv.getMASACH());
            addStatement.setDate(3, mttv.getNGAYMUON());
            addStatement.setDate(4, mttv.getNGAYTRA());
            addStatement.setInt(5, mttv.getSOLUONG());
            addStatement.setString(6, mttv.getQLTHUVIEN());
            if (capnhatSL(mttv.getMASACH(),mttv.getSOLUONG(),true))
                addStatement.executeUpdate();
            addStatement.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(con);
        }
        return false;
    }
    public boolean deleteMT(MuonTra_ThuVien mttv) {
        Connection con = getConnection();
        String sql = "DELETE FROM muontra WHERE MASV=? and MASACH=?";
        try {
            PreparedStatement deleteStatement = con.prepareStatement(sql);
            deleteStatement.setString(1, mttv.getMSV());
            deleteStatement.setString(2, mttv.getMASACH());
            capnhatSL(mttv.getMASACH(), getSLMuon(mttv.getMSV(), mttv.getMASACH()),false);
            deleteStatement.executeUpdate();
            deleteStatement.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(con);
        }
        return false;

    }
    public List<MuonTra_ThuVien> searchMT(String msv, String ms) {
        Connection con = getConnection();
        List<MuonTra_ThuVien> ds = new ArrayList<>();
        String sql = "SELECT * FROM muontra WHERE MASV like '" + msv + "%' AND MASACH LIKE '" + ms + "%'";
        try {
            Statement searchStatement = con.createStatement();
            ResultSet rs = searchStatement.executeQuery(sql);
            while (rs.next()) {
                String Msv = rs.getString("MASV");
                String maSach = rs.getString("MASACH");
                Date ngayMuon = rs.getDate("NGAYMUON");
                Date ngayTra = rs.getDate("NGAYTRA");
                int slg = rs.getInt("SOLUONG");
                String Qltv = rs.getString("QLTHUVIEN");
                MuonTra_ThuVien mttv = new MuonTra_ThuVien(Msv, maSach, ngayMuon, ngayTra, slg, Qltv);
                ds.add(mttv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            System.out.println(sql);
            closeConnection(con);
        }
        return ds;
    }
}
