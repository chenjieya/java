package domain;

import java.util.List;

public class DeptClass {
    private Integer deptno;
    private String dname;
    private String loc;

    // 还得有一个属性，如果想要通过部门查找成员得话，应该使用list集合存储
    private List<EmpClass> empList;

    @Override
    public String toString() {
        return "DeptClass{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                ", empList=" + empList +
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

    public List<EmpClass> getEmpList() {
        return empList;
    }

    public void setEmpList(List<EmpClass> empList) {
        this.empList = empList;
    }

    public DeptClass(Integer deptno, String dname, String loc, List<EmpClass> empList) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
        this.empList = empList;
    }

    public DeptClass() {
    }
}
