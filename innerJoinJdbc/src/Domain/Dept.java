package Domain;

public class Dept {
    private Integer deptno;
    private String dname;
    private String loc;

    public Dept() {}

    public Dept(Integer deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public String toString() {
        StringBuilder str = new StringBuilder("{");
        str.append("deptno: " + deptno + ", ");
        str.append("dname:" + dname + ", ");
        str.append("loc:" + loc + "}");
        return str.toString();
    }

    public Integer getDeptno() {
        return deptno;
    }

    public String getDname() {
        return dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
