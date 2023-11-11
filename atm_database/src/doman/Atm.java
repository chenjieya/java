package doman;

public class Atm {

    private String name;
    private String password;
    private Float balance;

    public Atm() {}

    public Atm(String name, String password, Float balance) {
        this.balance = balance;
        this.name = name;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
