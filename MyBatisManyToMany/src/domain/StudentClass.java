package domain;

import java.util.List;

public class StudentClass {

    private Integer sid;
    private String sname;

    private List<TeacherClass> tid;

    public StudentClass() {
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", tid=" + tid +
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

    public List<TeacherClass> getTid() {
        return tid;
    }

    public void setTid(List<TeacherClass> tid) {
        this.tid = tid;
    }

    public StudentClass(Integer sid, String sname, List<TeacherClass> tid) {
        this.sid = sid;
        this.sname = sname;
        this.tid = tid;
    }
}
