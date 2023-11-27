package domain;

public class UserClass {

    private String aname;
    private String apassword;
    private Float abalance;
    private String nickname;

    public UserClass() {
    }

    public UserClass(String aname, String apassword, Float abalance, String nickname) {
        this.aname = aname;
        this.apassword = apassword;
        this.abalance = abalance;
        this.nickname = nickname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public Float getAbalance() {
        return abalance;
    }

    public void setAbalance(Float abalance) {
        this.abalance = abalance;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
