package testA;

public class TerstAA {
    public static void main(String[] args) {
        /*在同包中不能访问到私有属性private,只能在本类中访问*/
        TestA ta = new TestA();
        ta.testPublic();
        ta.testDefault();
        ta.testProtected();
    }
}
