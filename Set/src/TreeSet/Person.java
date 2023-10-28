package TreeSet;
import java.lang.Comparable;
public class Person implements  Comparable<Person> {
    private String name;
    private int testNum;

    private int age;

    public Person(String name, int num, int age) {
        this.name = name;
        this.testNum = num;
        this.age = age;
    }

    // 重写equals方法
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Person) {
            Person another = (Person) obj;
            return this.name.equals(another.name);
        }

        return false;
    }

    // 重写hashCode方法
    public int hashCode() {
        // 两个Person的name属性值一致，需要让hashCode的返回值也一致
        return this.name.hashCode();
    }

    // 重写toString方法
    public String toString(){
        StringBuilder builder = new StringBuilder("{");
        builder.append(this.name);
        builder.append(",");
        builder.append(this.testNum);
        builder.append("}");

        return builder.toString();
    }

    // compareTo方法
    @Override
    public int compareTo(Person o) {
        int val = this.name.compareTo(o.name);
        if (val != 0) {
            return val;  // 说明名字不一样，直接添加进去
        }
        return this.age - o.age;  // 小到大
    }

    public String getName() {
        return this.name;
    }

    public int getTestNum() {
        return this.testNum;
    }

    public int getAge() { return this.age; }

}

