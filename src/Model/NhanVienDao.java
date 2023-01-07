package Model;

import java.sql.*;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class NhanVienDao extends TKDAO{
    public List<NhanVien_ThuVien> hienThiNhanVien(){
        List<NhanVien_ThuVien> ds = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM NHANVIEN";
        try {
            Statement selectStatement = con.createStatement();
            ResultSet rs = selectStatement.executeQuery(sql);
            while (rs.next()){
                String matt = rs.getString("MATT");
                String hvt = rs.getString("HVT");
                Date ns = rs.getDate("NS");
                String gt = rs.getString("GT");
                String diachi = rs.getString("DIACHI");
                String email = rs.getString("EMAIl");
                String user = rs.getString("USER");
                NhanVien_ThuVien nhanVien = new NhanVien_ThuVien(matt, hvt,ns,gt,diachi,email,user);
                ds.add(nhanVien);

            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            closeConnection(con);
        }
        return ds;
    }
    public boolean addNhanVien(NhanVien_ThuVien nhanvien){
        Connection con = getConnection();
        String sql = "INSERT INTO NHANVIEN(MATT, HVT, NS, GT, DIACHI, EMAIL, USER, PASS) VALUES (?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement addStatement = con.prepareStatement(sql);
            addStatement.setString(1, nhanvien.getMaTT());
            addStatement.setString(2, nhanvien.getHVT());
            addStatement.setDate(3,  nhanvien.getNs());
            addStatement.setString(4, nhanvien.getGt());
            addStatement.setString(5, nhanvien.getDiachi());
            addStatement.setString(6, nhanvien.getEmail());
            addStatement.setString(7, nhanvien.getUser());
            addStatement.setString(8, nhanvien.getPass());

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
    public boolean updateNhanVien(NhanVien_ThuVien nhanvien){
        Connection con = getConnection();
        String sql = "UPDATE NHANVIEN SET HVT=?, NS=?, GT=?, DIACHI=?, EMAIL=?, USER=?, PASS=? WHERE MATT = ?";
        try{
            PreparedStatement updateStatement = con.prepareStatement(sql);
            updateStatement.setString(1, nhanvien.getHVT());
            updateStatement.setDate(2, nhanvien.getNs());
            updateStatement.setString(3, nhanvien.getGt());
            updateStatement.setString(4, nhanvien.getDiachi());
            updateStatement.setString(5, nhanvien.getEmail());
            updateStatement.setString(6, nhanvien.getUser());
            updateStatement.setString(7, nhanvien.getPass());
            updateStatement.setString(8, nhanvien.getMaTT());
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
    public boolean deleteNhanVien(String matt){
        Connection con = getConnection();
        String sql = "DELETE FROM NHANVIEN WHERE MATT=?";
        try{
            PreparedStatement updateStatement = con.prepareStatement(sql);
            updateStatement.setString(1,matt);
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
    public List<NhanVien_ThuVien> timKiem(String MATT){
        List<NhanVien_ThuVien> ds = new ArrayList<>();
        Connection con = getConnection();
        String sql = "SELECT * FROM NHANVIEN WHERE MATT LIKE '" + MATT + "%' " ;
        try {
            Statement selectStatement = con.createStatement();
            ResultSet rs = selectStatement.executeQuery(sql);
            while (rs.next()){
                String matt = rs.getString("MATT");
                String hvt = rs.getString("HVT");
                Date ns    = rs.getDate("NS");
                String gt = rs.getString("GT");
                String diachi = rs.getString("DIACHI");
                String email = rs.getString("EMAIL");
                String user = rs.getString("USER");
                NhanVien_ThuVien nhanvien = new NhanVien_ThuVien(matt,hvt, ns,gt,diachi,email,user);
                ds.add(nhanvien);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            closeConnection(con);
        }
        return ds;
    }

    public boolean checkUser (String user){
        Connection con = getConnection();
        String sql = "SELECT USER FROM NHANVIEN";
        boolean check = true;
        try {
            PreparedStatement CheckStatement = con.prepareStatement(sql);

            ResultSet rs = CheckStatement.executeQuery();
            //kiểm tra username có trùng chưa
            while (rs.next()){
                if(user.equals(rs.getString("USER"))){
                    check = false;
                    break;
                }
            }
            CheckStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection(con);
        }
        return check;
    }
    public boolean checkMATT (String matt){
        Connection con = getConnection();
        String sql = "SELECT MATT FROM NHANVIEN";
        boolean check = true;
        try {
            PreparedStatement CheckStatement = con.prepareStatement(sql);

            ResultSet rs = CheckStatement.executeQuery();
            //kiểm tra username có trùng chưa
            while (rs.next()){
                if(matt.equals(rs.getString("MATT"))){
                    check = false;
                    break;
                }
            }
            CheckStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection(con);
        }
        return check;
    }
}
