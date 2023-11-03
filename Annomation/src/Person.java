public class Person extends Animation implements TestInterface {
    // @Override 报错，代码验证，因为不是重写，是重载，参数列表不一样
    public void eat(String eat) {
        System.out.println("person中得eat方法");
    }

    // 重写注解
    @Override
    public void test() {

    }
}
