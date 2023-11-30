package domain;

import java.util.Date;

public class StudentClass {

    private Integer s_id;
    private String s_name;
    private String s_sex;
    private String s_data;
    private String s_address;
    private Float chinese;
    private Float english;
    private Float physics;
    private Float physical;
    private Integer classid;

    @Override
    public String toString() {
        return "StudentClass{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_sex='" + s_sex + '\'' +
                ", s_data=" + s_data +
                ", s_address='" + s_address + '\'' +
                ", chinese=" + chinese +
                ", english=" + english +
                ", physics=" + physics +
                ", physical=" + physical +
                ", classid=" + classid +
                '}';
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public String getS_data() {
        return s_data;
    }

    public void setS_data(String s_data) {
        this.s_data = s_data;
    }

    public String getS_address() {
        return s_address;
    }

    public void setS_address(String s_address) {
        this.s_address = s_address;
    }

    public Float getChinese() {
        return chinese;
    }

    public void setChinese(Float chinese) {
        this.chinese = chinese;
    }

    public Float getEnglish() {
        return english;
    }

    public void setEnglish(Float english) {
        this.english = english;
    }

    public Float getPhysics() {
        return physics;
    }

    public void setPhysics(Float physics) {
        this.physics = physics;
    }

    public Float getPhysical() {
        return physical;
    }

    public void setPhysical(Float physical) {
        this.physical = physical;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public StudentClass(Integer s_id, String s_name, String s_sex, String s_data, String s_address, Float chinese, Float english, Float physics, Float physical, Integer classid) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_sex = s_sex;
        this.s_data = s_data;
        this.s_address = s_address;
        this.chinese = chinese;
        this.english = english;
        this.physics = physics;
        this.physical = physical;
        this.classid = classid;
    }

    public StudentClass() {
    }
}
