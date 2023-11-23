package domain;

public class ProductClass {
    private Integer pid;
    private String pname;
    private Float price;
    private CategoryClass category;

    public ProductClass() {
    }

    @Override
    public String toString() {
        return "ProductClass{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public CategoryClass getCategory() {
        return category;
    }

    public void setCategory(CategoryClass category) {
        this.category = category;
    }

    public ProductClass(Integer pid, String pname, Float price, CategoryClass category) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.category = category;
    }
}
