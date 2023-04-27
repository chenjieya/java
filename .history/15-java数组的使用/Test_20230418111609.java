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
    ·* 2.给定两个数组a{1,2,3,4}, b{5,6,7,8}将两个数组内的元素对应位置互换
    */

    /**
     * 3. 给定一个数组a{1,2,3,4,5,6}将这个数组中的元素头尾对应互换位置
     */
    

    /**
     * 4. 给定两个数组a{1,2,3}，b{4，5}合并两个数组(创建一个新的数组5个长度)
     */

    /**
     * 5. 给定一个数组a{1,2,3,9,4,5}按照数组中的最大值位置，将数组拆成两个{1,2,3} {4,5}
     */

    /**
     * 6.给定一个数组a{1,3,5,7,9,0,2,4,6,8}找寻数组中的最大值和最小值
     */

    /**
     * 7.给定一个数组a{1,2,3,0,0,4,5,0,6,0,7}去掉数组中的0元素（数组的长度是不能变的）
     **/ 

    /**
     * 8.创建一个数组，存储2-100之间的素数(质数)
     */

    /**
     * 9数组元素的排序(冒泡、快速、选择、希尔...)
     */
  }
}
