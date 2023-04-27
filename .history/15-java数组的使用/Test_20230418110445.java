public class Test {
  public static void main(String[] args) {
    /**
     * 静态声明
     */
    int[] array = new int[]{10,20,30,40};
    /**
     * 取值
     */
    int value = array[0];
    System.out.println(value);
    /**
     * 赋值
     */
    array[3] = 400;
    System.out.println(array[3]);
    /**
     * 遍历数组
     * jdk1.5版本之后 增强for循环
     */
    for(int item : array) {
      System.out.println(item);
    }

    for(int i = 0; i < 4; i++) {
      System.out.println(array[i]);
    }




    /**
     * 动态初始化数组（有长度没有元素）
     */
    int[] arr = new int[5];
    for(int val : arr) {
      System.out.println(val);  // 默认整数是0
    }

    /**
     * 1.创建一个数组用来存储1-100之间的基数
     */

     /**
      * 2.
      */
    
  }
}
