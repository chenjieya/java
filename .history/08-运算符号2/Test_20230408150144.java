// 关系运算  > >= < <= != == instanceof
// 逻辑运算
// 位运算

public class Test {
  public static void main(String[] args) {
    // 3 / 2 -> 00000000 00000000 00000000 00000011
    // 5 / 2 -> 00000000 00000000 00000000 00000101

    // 按位与
    // 000000001 -> 1
   System.out.println(3&5); // 1
    
    // 按位或
    // 000000111 -> 7
    System.out.println(3|5); // 7

    // 按位异或
    // 000000110 ->6
    System.out.println(3^5); // 6
    
    // 按位取反
    /**
     * 原码：00000000 00000000 00000000 00000110
     * 反码：00000000 00000000 00000000 00000110
     * 补码：00000000 00000000 00000000 00000110
     * 
     * 补码取反->00000000 00000000 00000000 00000110
     * 11111111 11111111 11111111 11111001
     */
    System.out.println(~6); // -7

    
  }
}