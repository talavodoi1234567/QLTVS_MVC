package Model;

import java.sql.*;

public class TKDAO {
    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/qltv";
        try {
            Connection con = (Connection) DriverManager.getConnection(url, "root", "");

            System.out.println("Database connected");

            return con;
        } catch (SQLException ex) {

            System.out.println("Can't connect to database");
            ex.printStackTrace();
        }
        return null;
    }

    public void closeConnection(Connection con) {
        try {
            con.close();
            System.out.println("Database closed");
        } catch (SQLException ex) {
            System.out.println("Can't close connection");
        }
    }

    public boolean login(String user, String pass, String phanquyen) {
        Connection con = getConnection();
        String sql = "SELECT * FROM NHANVIEN where USER = ? and PASS = ?";
        boolean bl = false;
        try {
            PreparedStatement loginStatement = con.prepareStatement(sql);

            loginStatement.setString(1, user);
            loginStatement.setString(2, pass);

            ResultSet rs = loginStatement.executeQuery();
            if (rs.next()) {
                bl = true;
            } else bl = false;
            loginStatement.close();

        } catch (Exception e) {
        } finally {
            closeConnection(con);
        }
        return bl;
    }

    public boolean signup(TaiKhoan u) {
        Connection con = getConnection();
        String sql = "INSERT INTO account(username, pass, email) VALUE (?, ?, ?)";
        try {
            PreparedStatement signUpStatement = con.prepareStatement(sql);
            signUpStatement.setString(1, u.getUser());
            signUpStatement.setString(2, u.getPassword());
            signUpStatement.setString(3, u.getEmail());

            signUpStatement.executeUpdate();

            signUpStatement.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection(con);
        }
        return false;
    }
    public boolean checkUser (String user){
        Connection con = getConnection();
        String sql = "SELECT username FROM ACCOUNT";
        boolean check = true;
        try {
            PreparedStatement CheckStatement = con.prepareStatement(sql);

            ResultSet rs = CheckStatement.executeQuery();
           //kiểm tra username có trùng chưa
            while (rs.next()){
                if(user.equals(rs.getString("username"))){
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