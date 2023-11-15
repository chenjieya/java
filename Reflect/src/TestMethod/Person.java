package TestMethod;

public class Person extends Animation{

    public void eat() {
        System.out.println("Person 无参数得eat方法");
    }

    public String eat( String r) {
        System.out.println("Person 带string参数的eat方法：" + r);
        return "测试";
    }

    private void swiming() {
        System.out.println("Person类中的私有方法");
    }

}
