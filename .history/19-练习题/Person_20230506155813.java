public class Person {
  public void drawStart(int line, boolean flag) {
    for(int i = line; i > 0; i--) {
      

      for(int j = 0; j < i; j++) {
        System.out.print('*');
      }
    }
  }
}
