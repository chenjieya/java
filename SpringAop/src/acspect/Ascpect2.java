package acspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class Ascpect2 {

    public void beforeMethod() {
        System.out.println("ascpect2-before  执行完1的fbefor执行2的");
    }

    public void afterReturnMethod() {
        System.out.println("喊完了~after-return");
    }

}
