package acspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class Ascpect1 {

    public void beforeMethod() {
        System.out.println("预备备~~~~ 喊！");
    }

    public void afterReturnMethod() {
        System.out.println("喊完了~after-return");
    }

    public void afterMethod() {
        System.out.println("最终方法 after 相当于finally");
    }

    public void throwException() {
        System.out.println("异常方法-代码执行异常会阻碍after-return的执行");
    }

    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕方法-before-around");
        pjp.proceed();
        System.out.println("环绕方法-around-around");
    }

}
