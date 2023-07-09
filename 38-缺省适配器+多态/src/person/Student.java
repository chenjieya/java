package person;

public class Student extends Person {
    public String name = "Student中的name属性";

    public void talk() {
        System.out.println("Student类中的talk方法");
    }

    public void study() {
        System.out.println("Student类中的study方法");
    }
}
