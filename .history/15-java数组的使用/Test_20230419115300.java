import java.util.Arrays;

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

    System.out.println("华丽的分割线======================================华丽的分割线");

    /**
     * 1.创建一个数组用来存储1-100之间的基数
     */
    int[] arr1 = new int[50];
    for(int i = 0; i < arr1.length; i++) {
      arr1[i] = i * 2 + 1;
      System.out.println(arr1[i]);
    }

    System.out.println("华丽的分割线======================================华丽的分割线");
    /**
    ·* 2.给定两个数组a{1,2,3,4}, b{5,6,7,8}将两个数组内的元素对应位置互换
    */
    int[] arr2 = {1,2,3,4};
    int[] arr3 = {5,6,7,8};
    
    for(int i = 0; i < arr2.length; i++) {
      int temp = arr2[i];
      arr2[i] = arr3[i];
      arr3[i] = temp;

      System.out.println(arr2[i]);
      System.out.println(arr3[i]);
    }


    System.out.println("华丽的分割线======================================华丽的分割线");
    /**
     * 3. 给定一个数组a{1,2,3,4,5,6}将这个数组中的元素头尾对应互换位置
     */
    int[] arr5 = {1,2,3,4,5,6};
    int start = 0;
    int end = arr5.length - 1;
    while(start < end) {
      int temp = arr5[start];
      arr5[start] = arr5[end];
      arr5[end] = temp;

      start++;
      end--;
    }

    for(int key : arr5) {
      System.out.println(key);
    }

    System.out.println("华丽的分割线======================================华丽的分割线");
    /**
     * 4. 给定两个数组a{1,2,3}，b{4，5}合并两个数组(创建一个新的数组5个长度)
     */
    int[] arr6 = {1,2,3};
    int[] arr7 = {4,5};
    int[] arr8 = new int[5];
      
    for(int j = 0; j < arr6.length; j++) {
      arr8[j] = arr6[j]; 
    }

    for(int k = 0; k < arr7.length; k++) {
      arr8[arr6.length+k] = arr7[k];
    }


    for(int key : arr8) {
      System.out.println(key);
    }
    System.out.println(Arrays.toString(arr8));
    System.out.println("华丽的分割线======================================华丽的分割线");
    /**
     * 5. 给定一个数组a{1,2,3,9,4,5}按照数组中的最大值位置，将数组拆成两个{1,2,3} {4,5}
     */
    int[] arr9 = {1,2,3,9,4,5};

    System.out.println("华丽的分割线======================================华丽的分割线");
    /**
     * 6.给定一个数组a{1,3,5,7,9,0,2,4,6,8}找寻数组中的最大值和最小值
     */

    System.out.println("华丽的分割线======================================华丽的分割线");
    /**
     * 7.给定一个数组a{1,2,3,0,0,4,5,0,6,0,7}去掉数组中的0元素（数组的长度是不能变的）
     **/ 

    System.out.println("华丽的分割线======================================华丽的分割线");
    /**
     * 8.创建一个数组，存储2-100之间的素数(质数)
     */

    System.out.println("华丽的分割线======================================华丽的分割线");
    /**
     * 9.数组元素的排序(冒泡、快速、选择、希尔...)
     */

    System.out.println("华丽的分割线======================================华丽的分割线");
    /**
     * 10.用户的登录认证（用数组当做小数据库，存储用户的信息）
     */
  }
}
