package DoMain;

public class CountryClass {
    private Integer cid;
    private String cname;

    public CountryClass() {
    }

    public CountryClass(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
