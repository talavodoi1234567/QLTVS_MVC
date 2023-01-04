package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SachDAO extends TKDAO {
    public List<Sach_ThuVien> hienThiSach(){
        List<Sach_ThuVien> ds = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM sach";
        try {
            Statement selectStatement = con.createStatement();
            ResultSet rs = selectStatement.executeQuery(sql);
            while (rs.next()){
                String maSach = rs.getString("MASACH");
                String tenSach = rs.getString("TENSACH");
                int namXb = rs.getInt("NAMXB");
                String nhaXb = rs.getString("NHAXB");
                int gia = rs.getInt("GIA");
                int soLuong = rs.getInt("SOLUONG");
                Sach_ThuVien sach = new Sach_ThuVien(maSach, tenSach, namXb, nhaXb, gia, soLuong);
                ds.add(sach);

            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            closeConnection(con);
        }
        return ds;
    }
    public boolean addSach(Sach_ThuVien sach){
        Connection con = getConnection();
        String sql = "INSERT INTO `sach`(`MASACH`, `TENSACH`, `NAMXB`, `NHAXB`, `GIA`, SOLUONG) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement addStatement = con.prepareStatement(sql);
            addStatement.setString(1, sach.getMASACH());
            addStatement.setString(2, sach.getTENSACH());
            addStatement.setInt(3, sach.getNAMXB());
            addStatement.setString(4, sach.getNHAXB());
            addStatement.setInt(5, sach.getGIA());
            addStatement.setInt(6, sach.getSOLUONG());

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
    public boolean updateSach(Sach_ThuVien sach){
        Connection con = getConnection();
        String sql = "UPDATE `sach` SET `TENSACH`=?,`NAMXB`=?,`NHAXB`=?,`GIA`=?,`SOLUONG`=? WHERE MASACH = ?";
        try{
            PreparedStatement updateStatement = con.prepareStatement(sql);
            updateStatement.setString(1, sach.getTENSACH());
            updateStatement.setInt(2, sach.getNAMXB());
            updateStatement.setString(3, sach.getNHAXB());
            updateStatement.setInt(4, sach.getGIA());
            updateStatement.setInt(5, sach.getSOLUONG());
            updateStatement.setString(6, sach.getMASACH());

            updateStatement.executeUpdate();

            updateStatement.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeConnection(con);
        }
        return false;
    }
    public boolean deleteSach(Sach_ThuVien sach){
        Connection con = getConnection();
        String sql = "DELETE FROM `sach` WHERE MASACH=?";
        try{
            PreparedStatement updateStatement = con.prepareStatement(sql);
            updateStatement.setString(1, sach.getMASACH());
            updateStatement.executeUpdate();
            updateStatement.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeConnection(con);
        }
        return false;
    }
    public List<Sach_ThuVien> timKiem(String tenSach){
        List<Sach_ThuVien> ds = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM sach WHERE TENSACH LIKE '" + tenSach + "%' ";
        try {
            Statement selectStatement = con.createStatement();
            ResultSet rs = selectStatement.executeQuery(sql);
            while (rs.next()){
                String maSach = rs.getString("MASACH");
                String TenSach = rs.getString("TENSACH");
                int namXb = rs.getInt("NAMXB");
                String nhaXb = rs.getString("NHAXB");
                int gia = rs.getInt("GIA");
                int soLuong = rs.getInt("SOLUONG");
                Sach_ThuVien sach = new Sach_ThuVien(maSach, TenSach, namXb, nhaXb, gia, soLuong);
                ds.add(sach);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            closeConnection(con);
        }
        return ds;
    }

}