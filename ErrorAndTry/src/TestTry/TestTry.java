package TestTry;

public class TestTry {

    // 将try{}catch(){} 放到函数中需要注意的事情
    public String testTry() {
        try {
            System.out.println("try开始");
            String str = null;
            str.charAt(10);   // NullPointerException
            System.out.println("try结束");
            return "try中的返回值";   // finally中的代码是一定要执行的，如果try中没有报错，走到了return，则先保留return的值，将finally都执行完之后，在将该值返回出去。
        }catch(NullPointerException e) {
            System.out.println("捕获异常");
        }finally {
            System.out.println("finally");;
        }

        return "程序正常结束";
    }


    public static void main(String[] args) {
        String str = new TestTry().testTry();
        System.out.println(str);
    }
}
