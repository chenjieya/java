public class Person {
    private String name;
    private int testNum;

    public Person(String name, int num) {
        this.name = name;
        this.testNum = num;
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

    public String getName() {
        return this.name;
    }

    public int getTestNum() {
        return this.testNum;
    }
}

