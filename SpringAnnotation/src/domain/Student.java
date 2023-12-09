package domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Scope("prototype")
public class Student {

    private Integer sid;
    private String sname;

    // 如果存在两个类型相同的（Imp1,Imp2），则不知道找谁，然后报错了.使用@Qualifier注解来指定那个对象
    @Autowired
    @Qualifier("imp1")
    private TestInterface inter;

    public TestInterface getInter() {
        return inter;
    }

    public void setInter(TestInterface inter) {
        this.inter = inter;
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

    public Student(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public Student() {
    }
}
