public class Person {
  /**
   * 画直角三角形的星星
   * @param line 行数
   * @param flag 左右 true左 false右 
   */
  public void drawStart(int line, boolean flag) {
    for(int i = line; i > 0; i--) {
      if(!flag) {
        for(int k = 1; k <= line - i; k++) {
          System.out.print(" ");
        }
      }
      for(int j = 1; j <= i; j++) {
        System.out.print('*');
      }
      System.out.println("");
    }
  }

  public int[] contanctArray(int[] a, int[] b) {
    
  }

  
}
