package Domain;

import java.util.Date;

public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private String mgr;
    private Date hiredate;
    private Float sal;
    private Float comm;
    private Integer deptno;

    public Emp() {}

    // 在构造函数中给属性赋值
    public Emp(Integer empno, String ename, String job, String mgr, Date hiredate, Float sal, Float comm, Integer deptno) {
        // 给属性赋值
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    public String toString() {
        return "empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Float getComm() {
        return comm;
    }

    public Float getSal() {
        return sal;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public Integer getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public String getMgr() {
        return mgr;
    }

    public void setComm(Float comm) {
        this.comm = comm;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setMgr(String mgr) {
        this.mgr = mgr;
    }

    public void setSal(Float sal) {
        this.sal = sal;
    }

}
