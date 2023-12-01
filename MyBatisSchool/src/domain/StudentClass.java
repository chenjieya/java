package domain;

import java.sql.Date;

public class StudentClass {

    private Integer id;
    private String sname;
    private String sex;
    private Date ctime;

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", ctime=" + ctime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public StudentClass(Integer id, String sname, String sex, Date ctime) {
        this.id = id;
        this.sname = sname;
        this.sex = sex;
        this.ctime = ctime;
    }

    public StudentClass() {
    }
}
