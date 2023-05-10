
public class Test {
  public static void main(String[] args) {
    Person p = new Person();
    p.drawStart(4, false);
    int[] a = {1,2,3,4};
    int[] b = {5,6,7,8};
    int[] c = p.contanctArray(a,b);
    System.out.println(c);
    for(int item : c) {
      System.out.println(item);
    }
    
    int[] d = {1,2,3,4};
    int[] e = p.changeArray(d);
    for(int item : e) {
      System.out.println(item);
    }

    System.out.println("----------------");

    int[] k = {3,2,87,4,38,67,8};
    int f = p.maxInt(k);
    System.out.println(f);


    p.test();

  }
}
