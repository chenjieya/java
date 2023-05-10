import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;  // 倒入jdk中的包

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

  /**
   * 互换两个数组
   * @param a
   * @param b
   * @return int[]
   */
  public int[] contanctArray(int[] a, int[] b) {
    int[] c = new int[a.length];
    c = a;
    a = b;
    b = c;
    return a;
  }

  /**
   * 将数组首尾元素互换
   * @param a 数组
   * @return a
   */
  public int[] changeArray(int[] a) {
    int start = 0;
    int end = a.length - 1;

    while(start < end) {
      int temp = a[start];
      a[start] = a[end];
      a[end] = temp;

      start++;
      end--;
    }

    return a;
  }

  /**
   * 找出最大值
   * @param a
   * @return
   */
  public int maxInt(int[] a) {
    int max = a[0];
    for(int i = 0; i < a.length; i++) {
      if(max < a[i]) {
        max = a[i];
      }
    }
    return max;
  }
  

  

  public void test(int[] arr) {
    Scanner p = new Scanner(System.in);
  int num = p.nextInt();
    boolean flag = false;
    for(int i = 0; i < arr.length; i++) {
      if(num == arr[i]) {
        flag = true;
        System.out.println("找到了");
        break;
      }
    }

    if(!flag) {
      System.out.println("没有找到");
    }
  }
}
