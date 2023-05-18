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
    // 1. 判断当前数组的长度是否能满足数组需要的长度
    if(resultArray.length - minLen < 0) {
      // 2. 数组扩容
      this.growArrayLen(minLen);
    }
  }

  /**
   * 数组扩容
   * @param minLen 数组所需要的最小长度
   */
  public void growArrayLen(int minLen) {
    
  }

  /**
   * 向数组中添加一个数值
   * @param num 添加的值
   * @return  是否添加成功
   */
  public boolean add (int num) {
    this.judgeArrayLen(resultArray.length+1);

    return true;
  }
}
