package domain;

import java.util.Date;
import java.util.List;

public class User {

    private String username;
    private Integer age;
    private String sex;
    private Date birthday;


    private List<Wallet> wallet;



    public List<Wallet> getWallet() {
        return wallet;
    }

    public void setWallet(List<Wallet> wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", wallet=" + wallet +
                '}';
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User(String username, Integer age, String sex, Date birthday, List<Wallet> wallet) {
        this.username = username;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
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
