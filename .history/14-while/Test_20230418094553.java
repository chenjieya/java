public class Test {
  public static void main(String[] args) {


    // ok:for(int i = 1; i <= 5; i++) {
    //   ko:for(int j = 1; j <= 5; j++) {
    //     if(j == 3) {
    //       break ok;
    //     }
    //     System.out.println("帅");
    //   }
    // }
    /**
     * 执行输出多少次，执行完i，j
     * 两次 j = 3; i = 1;
     */

    // ok:for(int i = 1; i <= 5; i++) {
    //   ko:for(int j = 1; j <= 5; j++) {
    //     if(j == 3) {
    //       continue ok;
    //     }
    //     System.out.println("帅");
    //   }
    // }

    /**
     * 执行输出多少次，执行完i，j
     * 十次 j = 3; i = 6;
     */


     /**
      * 有一个水池，已经盛满了120立方迷的水
      * 有一个进水管，每小时进水18立方米
      * 有一个排水管，每小时排水30立方米
      * 两个水管一起开
      * 经过多少小时，水池的水排放干净
      */
      int total = 120;
      int i = 0;
      while(total > 0) {
        i++;
        total = total + 18 - 30;
      }

      System.out.println(i);
  }
}
