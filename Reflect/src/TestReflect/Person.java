package TestReflect;

public class Person extends Animation{

    public String name;
    private int age;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
