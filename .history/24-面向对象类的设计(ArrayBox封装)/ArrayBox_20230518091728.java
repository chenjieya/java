public class ArrayBox {
  /**
   * ArrayBox obj = new ArrayBox();
   * obj.add(1);
   */
  public int[] resultArray = new int[10];
  
  /**
   * @param minLen 该数组最小能存储的长度
   */
  public void judgeArrayLen(int minLen) {
    // 1. 判断数组的长度是否能存储下

  }

  /**
   * 向数组中添加一个数值
   * @param num 添加的值
   * @return  是否添加成功
   */
  public boolean add (int num) {
    this.judgeArrayLen(resultArray.length+1);
  }
}
