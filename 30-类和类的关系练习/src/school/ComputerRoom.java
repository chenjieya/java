package school;

public class ComputerRoom {

    private Computer[] computers = new Computer[5];

    public void intComputer() {
        for (int i = 0; i < computers.length; i++) {
            this.computers[i] = new Computer(i+1);
        }
    }

    public void welecomeStudent(Student student) {
        System.out.println("欢迎学生"+student.getName()+"加入机房");

        for (int i = 0; i < this.computers.length; i++) {
            if (!this.computers[i].isUsed()) {
                System.out.println("电脑编号："+ this.computers[i].getComputerNum());
                student.useComputer(this.computers[i]);
                break;
            }
        }
    }

    {
        this.intComputer();
    }
}
