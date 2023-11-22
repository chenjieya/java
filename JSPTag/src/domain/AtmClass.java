package domain;

public class AtmClass {

    private String aname;
    private String apassword;
    private Float abalance;

    @Override
    public String toString() {
        return "AtmClass{" +
                "aname='" + aname + '\'' +
                ", apassword='" + apassword + '\'' +
                ", abalance=" + abalance +
                '}';
    }

    public AtmClass() {
    }

    public AtmClass(String aname, String apassword, Float abalance) {
        this.aname = aname;
        this.apassword = apassword;
        this.abalance = abalance;
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
}
