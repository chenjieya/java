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
    System.out.println("方法执行完毕，main方法中a数组的值：" + a);
  }


  public void changeArray(int[] x) {
    System.out.println("方法执行开始："+ x[0]);
    x[0] = 10;
    System.out.println("方法执行最终："+ x[0]);
  }
}
