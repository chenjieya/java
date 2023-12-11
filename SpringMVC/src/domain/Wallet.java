package domain;

public class Wallet {

    private String color;
    private Float price;

    @Override
    public String toString() {
        return "Wallet{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Wallet(String color, Float price) {
        this.color = color;
        this.price = price;
    }

    public Wallet() {
    }
}
