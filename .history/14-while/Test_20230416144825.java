public class Test {
  public static void main(String[] args) {


    ok:for(int i = 1; i <= 5; i++) {
      ko:for(int j = 1; j <= 5; j++) {
        if(j == 3) {
          break ok;
        }
        System.out.println("帅");
      }
    }
    /**
     * 执行输出多少次，执行完i，j
     */

  }
}
