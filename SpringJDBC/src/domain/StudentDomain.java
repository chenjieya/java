package domain;

public class StudentDomain {

    private Integer sid;
    private String sname;

    @Override
    public String toString() {
        return "StudentDomain{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public StudentDomain() {
    }

    public StudentDomain(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
}
