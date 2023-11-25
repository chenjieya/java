package damain;

public class UserClass {

    private String username;
    private String password;

    public UserClass() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserClass(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
