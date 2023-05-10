public class Test {
  public int changeNum(int x) {
    System.out.println("方法执行开始："+ x);
    x = 10;
    System.out.println("方法执行最终："+ x);
    return x;
  }

  public static void main(String[] args) {
    Test t = new Test();
    // int a = 1;
    // a = t.changeNum(a);
    // System.out.println("方法执行完毕，main方法中a的值：" + a);

    int[] a = {1,2,3};
    t.changeArray(a);
    System.out.println("方法执行完毕，main方法中a数组的值：" + a[0]);

    int[] x = {1,2,3,4};
    int[] y = {5,6,7,8};
    t.changeArrayTwo(x, y);

    for(int key : x) {
      System.out.println(key);
    }

    for(int key : y) {
      System.out.println(key);
    }
    
  }


  public void changeArray(int[] x) {
    System.out.println("方法执行开始："+ x[0]);
    x[0] = 10;
    System.out.println("方法执行最终："+ x[0]);
  }

  /**
   * 交换数组，不用返回值也可以改变，传递的是地址
   * @param a
   * @param b
   */
  public void changeArrayTwo(int[] a, int[] b) {
    for(int i = 0; i < a.length; i++) {
      int temp = a[i];
      a[i] = b[i];
      b[i] = temp;
    }
  }
}
