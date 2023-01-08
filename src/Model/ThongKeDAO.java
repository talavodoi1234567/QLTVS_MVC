package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ThongKeDAO extends TKDAO {
    public List<MTSV> TKMTSV(String MSV) {
        List<MTSV> ds = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT sach.masach, tensach, gia, muontra.SOLUONG, ngaymuon, ngaytra " +
                "FROM sach, muontra WHERE sach.MASACH = muontra.MASACH AND masv = '" + MSV + "'";
        try {
            Statement selectStatement = con.createStatement();
            ResultSet rs = selectStatement.executeQuery(sql);
            while (rs.next()) {
                String maSach = rs.getString("MASACH");
                String tenSach = rs.getString("TENSACH");
                int gia = rs.getInt("GIA");
                int soLuong = rs.getInt("SOLUONG");
                Date ngayMuon = rs.getDate("NGAYMUON");
                Date ngayTra = rs.getDate("NGAYTRA");
                MTSV mtsv = new MTSV(maSach, tenSach, gia, soLuong, ngayMuon, ngayTra);
                ds.add(mtsv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(con);
        }
        return ds;
    }
    public List<MuonTra_ThuVien> TKMTTT(int thang, int nam){
        List<MuonTra_ThuVien> ds = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM muontra WHERE MONTH(ngaymuon) = ? AND YEAR(ngaymuon) = ?";
        try{
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, thang);
            stm.setInt(2, nam);
            ResultSet rs = stm.executeQuery();
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
        }catch (Exception e){

        }finally {
            closeConnection(con);
        }
        return ds;
    }
    public List<STM> TKSTM(){
        List<STM> ds = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT sach.MASACH, tensach, gia, SUM(muontra.SOLUONG) AS soluong " +
                "FROM sach, muontra " +
                "WHERE sach.MASACH = muontra.MASACH AND ngaytra > DATE(NOW()) " +
                "GROUP BY sach.MASACH";
        try {
            Statement selectStatement = con.createStatement();
            ResultSet rs = selectStatement.executeQuery(sql);
            while (rs.next()) {
                String maSach = rs.getString("MASACH");
                String tenSach = rs.getString("TENSACH");
                int gia = rs.getInt("GIA");
                int soLuong = rs.getInt("SOLUONG");
                STM stm = new STM(maSach, tenSach, gia, soLuong);
                ds.add(stm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(con);
        }
        return ds;
    }
}
