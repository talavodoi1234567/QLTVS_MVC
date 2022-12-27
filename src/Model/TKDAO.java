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
            throw new RuntimeException(ex);
        }
    }

    public void closeConnection(Connection con) {
        try {
            con.close();
            System.out.println("Database closed");
        } catch (SQLException ex) {
            System.out.println("Can't close connection");
        }
    }

    public boolean login(String user, String pass) {
        Connection con = getConnection();
        String sql = "SELECT * FROM ACCOUNT where username = ? and pass = ?";
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
}
