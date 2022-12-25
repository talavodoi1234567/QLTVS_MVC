package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SachDAO extends TKDAO {
    public boolean addSach(Sach_ThuVien sach){
        Connection con = getConnection();
        String sql = "INSERT INTO `sach`(`MASACH`, `TENSACH`, `NAMXB`, `NHAXB`, `GIA`, SOLUONG) VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement addStatement = con.prepareStatement(sql);
            addStatement.setString(1, sach.getMASACH());
            addStatement.setString(2, sach.getTENSACH());
            addStatement.setString(3, sach.getNHAXB());
            addStatement.setInt(4, sach.getNAMXB());
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
}