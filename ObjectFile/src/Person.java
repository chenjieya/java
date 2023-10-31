import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private long serialVersionUID = 1677854630453758195L;

    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("name: " + this.name + ", age: " + this.age + "}");
        return sb.toString();
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }
}
