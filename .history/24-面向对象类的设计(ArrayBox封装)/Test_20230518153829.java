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

    obj.get(7);
    obj.remove(0);
    for(int i = 0; i < obj.size(); i++) {
      System.out.println(obj.resultArray[i]);
    }
  }
}
