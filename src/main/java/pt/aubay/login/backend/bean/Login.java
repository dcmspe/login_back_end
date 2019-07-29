package pt.aubay.login.backend.bean;

public class Login {

    private String user;

    private String password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Login() {

    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
