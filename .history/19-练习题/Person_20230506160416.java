public class Person {
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
    }
  }
}
