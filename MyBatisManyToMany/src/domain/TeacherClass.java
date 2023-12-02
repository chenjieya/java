package domain;

import java.util.List;

public class TeacherClass {

    private Integer tid;
    private String tname;

    private List<StudentClass> sid;

    @Override
    public String toString() {
        return "TeacherClass{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", sid=" + sid +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<StudentClass> getSid() {
        return sid;
    }

    public void setSid(List<StudentClass> sid) {
        this.sid = sid;
    }

    public TeacherClass(Integer tid, String tname, List<StudentClass> sid) {
        this.tid = tid;
        this.tname = tname;
        this.sid = sid;
    }

    public TeacherClass() {
    }
}
