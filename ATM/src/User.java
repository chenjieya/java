public class User {
    private String name;
    private String password;
    private Float price;

    public User(String name, String password, Float price) {
        this.name = name;
        this.password = password;
        this.price = price;
    }


    public String getName() {
        return this.name;
    }
    public String getPassword() {
        return this.password;
    }
    public Float getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String pwd) {
        this.password = pwd;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
}
