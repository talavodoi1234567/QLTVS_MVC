package Model;

public class TaiKhoan {
    String user;
    String password;
    String email;
    public TaiKhoan(String user, String password, String email)
    {
        this.user = user;
        this.password = password;
        this.email = email;
    }
    public TaiKhoan(String user, String password){
        this.user = user;
        this.password = password;
        this.email = "";
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
