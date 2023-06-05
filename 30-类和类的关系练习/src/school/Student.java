package school;

public class Student {
    private String name;

    public Student() {}
    public Student(String name) {
        this.name = name;
    }

    public void useComputer(Computer computer) {
        System.out.println("学生"+this.name+"开始使用电脑，电脑编号："+computer.getComputerNum());
        computer.turnOn();
    }

    public String getName() {
        return this.name;
    }
}
