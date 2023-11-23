package domain;

public class CategoryClass {

    private Integer cid;
    private String cname;

    public CategoryClass(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "CategoryClass{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public CategoryClass() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
