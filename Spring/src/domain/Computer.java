package domain;

public class Computer {

    private Integer cid;
    private String cname;
    private Float cprice;

    public Computer() {
    }

    public Computer(Integer cid, String cname, Float cprice) {
        this.cid = cid;
        this.cname = cname;
        this.cprice = cprice;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cprice=" + cprice +
                '}';
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

    public Float getCprice() {
        return cprice;
    }

    public void setCprice(Float cprice) {
        this.cprice = cprice;
    }
}
