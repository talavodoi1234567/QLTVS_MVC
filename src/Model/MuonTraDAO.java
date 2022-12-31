package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MuonTraDAO extends TKDAO{
    public List<MuonTra_ThuVien> hienthiMT(){
        List<MuonTra_ThuVien> ds = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM muontra";
        try{
            Statement selectStatement = con.createStatement();
            ResultSet rs = selectStatement.executeQuery(sql);
            while (rs.next()){
                String msv = rs.getString("MSV");
                String maSach = rs.getString("MASACH");
                String ngayMuon = rs.getString("NGAYMUON");
                String ngayTra = rs.getString("NGAYTRA");
                int sl = rs.getInt("SOLUONG");
                String qltv = rs.getString("QLTHUVIEN");
                MuonTra_ThuVien mttv = new MuonTra_ThuVien(msv, maSach, ngayMuon, ngayTra, sl, qltv);
                ds.add(mttv);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeConnection(con);
        }
        return ds;
    }
    public boolean addMT(MuonTra_ThuVien mttv){
        Connection con = getConnection();
        String sql = "INSERT INTO `muontra`(`MASV`, `MASACH`, `NGAYMUON`, `NGAYTRA`, `SOLUONG`, `QLTHUVIEN`) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement addStatement = con.prepareStatement(sql);
            addStatement.setString(1, mttv.getMSV());
            addStatement.setString(2, mttv.getMASACH());
            addStatement.setString(3, mttv.getNGAYMUON());
            addStatement.setString(4, mttv.getNGAYTRA());
            addStatement.setInt(5, mttv.getSOLUONG());
            addStatement.setString(6, mttv.getQLTHUVIEN());
            addStatement.executeUpdate();
            addStatement.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeConnection(con);
        }
        return false;
    }
    public boolean deleteMT(MuonTra_ThuVien mttv){
        Connection con = getConnection();
        String sql = "DELETE FROM muontra WHERE MASACH=?";
        try{
            PreparedStatement deleteStatement = con.prepareStatement(sql);
            deleteStatement.setString(1, mttv.getMASACH());
            deleteStatement.executeUpdate();
            deleteStatement.close();

            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeConnection(con);
        }
        return false;
    }
}
