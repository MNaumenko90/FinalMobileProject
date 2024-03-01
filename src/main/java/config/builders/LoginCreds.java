package config.buiders;

public class LoginCreds {
    private String username;
    private String password;
    public LoginCreds(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
