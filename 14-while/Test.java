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
      int hour = 0;
      while(total > 0) {
        hour++;
        total = total + 18 - 30;
      }

      System.out.println(hour);

      /**
       * 小明同学从A点以7km每小时的速度像B点出发
       * 哥哥从B点以18km每小时的速度向A点出发
       * A和B之间的距离是1000km
       * 求解 小明同学和哥哥经过多少个小时相遇？
       */
      int s = 1000;
      int xiaomingV = 7;
      int gegeV = 18;
      int hours = 0;
      while(s > 0) {
        hours ++;
        s = s - xiaomingV * hours - gegeV * hours;
      }
      System.out.println(hours);
  }
}
