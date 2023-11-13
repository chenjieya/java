package Domain;

public class CarClass {
    private Long cno;
    private String cname;
    private String color;
    private Double price;

    public CarClass() {
    }

    public CarClass(Long cno, String cname, String color, Double price) {
        this.cno = cno;
        this.cname = cname;
        this.color = color;
        this.price = price;
    }

    public long getCno() {
        return cno;
    }

    public String getCname() {
        return cname;
    }

    public String getColor() {
        return color;
    }

    public Double getPrice() {
        return price;
    }

    public void setCno(Long cno) {
        this.cno = cno;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarClass{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
