package school;

public class main {
    public static void main(String[] args) {
        Student stu = new Student("陈杰");
        Student stu1 = new Student("陈文杰");
        Student stu2 = new Student("李连杰");
        ComputerRoom compRoom = new ComputerRoom();

        compRoom.welecomeStudent(stu);
        compRoom.welecomeStudent(stu1);
        compRoom.welecomeStudent(stu2);
    }
}
