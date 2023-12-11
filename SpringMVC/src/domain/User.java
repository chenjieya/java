package domain;

import java.util.List;

public class User {

    private String username;
    private Integer age;
    private String sex;

    private List<Wallet> wallet;


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", wallet=" + wallet +
                '}';
    }

    public List<Wallet> getWallet() {
        return wallet;
    }

    public void setWallet(List<Wallet> wallet) {
        this.wallet = wallet;
    }

    public User(String username, Integer age, String sex, List<Wallet> wallet) {
        this.username = username;
        this.age = age;
        this.sex = sex;
        this.wallet = wallet;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }




    public User() {
    }
}
