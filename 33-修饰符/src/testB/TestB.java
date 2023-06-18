package testB;

import testA.TestA;

public class TestB extends TestA {
    public static void main(String[] args) {
        TestB tb = new TestB();
        tb.testPublic();
        tb.testProtected();
    }

    public void test() {
        // 在继承中private和default都不能被访问到
        this.testProtected();
        this.testPublic();
    }

    public void testB() {
        /**
         * 虽然是在继承中，但是不能通过父类去访问protected属性，受保护的是保护子类，只能通过子类去访问
         */
        TestA ta = new TestA();
        ta.testPublic();
    }


}
