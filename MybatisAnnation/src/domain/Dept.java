package domain;

import java.util.List;

public class Dept {

    private Integer deptno;
    private String dname;
    private String loc;

    private List<Emp> emplist;

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                ", emplist=" + emplist +
                '}';
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<Emp> getEmplist() {
        return emplist;
    }

    public void setEmplist(List<Emp> emplist) {
        this.emplist = emplist;
    }

    public Dept(Integer deptno, String dname, String loc, List<Emp> emplist) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
        this.emplist = emplist;
    }

    public Dept() {
    }
}
