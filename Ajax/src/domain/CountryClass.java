package domain;

public class CountryClass {
    private String cname;
    private Integer cid;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public CountryClass(String cname, Integer cid) {
        this.cname = cname;
        this.cid = cid;
    }

    public CountryClass() {
    }
}
