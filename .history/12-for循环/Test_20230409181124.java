public class Test {
  public static void main(String[] args) {
    /**
     * 甲乙丙丁四个人加工零件，加工零件总数是370个
     * 如果甲加工的零件数多10个
     * 如果乙加工的零件数少20个
     * 如果丙加工的零件数乘以2
     * 如果丁加工的零件数除以2
     * 则四人加工的零件数就相等了
     * 求：四个人加工的零件个数分别是是多少
     */
      for(int a = 1; a <= 370; a++) {
        if((a - 10) + (a + 20) + (a / 2) + (a * 2) == 370) {
          System.out.print("甲："a -10);
          System.out.print(a -10);
          System.out.print(a -10);
          System.out.print(a -10);
        }
      }

     /**
      * 小鸡两只脚 小兔子是四只脚
      * 小鸡+小兔总数50只  脚的总数是160
      * 求小鸡和小兔子个多少
      */
      for(int i = 1; i <= 50; i++) {
        if((i*2 + (50-i)*4 )== 160) {
          System.out.println("鸡：" + i);
          System.out.println("兔子：" + (50-i));
        }
      }

      /**
       * 通过循环找三位数的水仙花数（100-999）
       * 153 -->  1的立方 + 5的立方 + 3的立方 == 153
       */
      for(int j = 100; j<1000; j++) {
        
      }
  }
}
