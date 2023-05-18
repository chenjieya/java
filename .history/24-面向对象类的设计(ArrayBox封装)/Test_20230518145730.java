public class Test {
  public static void main(String[] args) {
    ArrayBox obj = new ArrayBox();
    obj.add(1);
    obj.add(1);
    obj.add(2);
    obj.add(3);
    obj.add(4);
    obj.add(1);
    obj.add(5);

   int a =  obj.get(7);
   System.out.println(a);
    // for(int item : obj.resultArray) {
    //   System.out.println(item);
    // }
  }
}
