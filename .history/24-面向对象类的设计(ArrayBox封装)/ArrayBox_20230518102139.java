
public class ArrayBox {
  /**
   * ArrayBox obj = new ArrayBox();
   * obj.add(1);
   */
  public int[] resultArray = new int[10];
  private int size = 0;
  
  /**
   * @param minLen 该数组最小能存储的长度
   */
  private void judgeArrayLen(int minLen) {
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
  private void growArrayLen(int minLen) {
    // 1. 先将数组扩容1.5倍
    int resultArrayLen = resultArray.length;
    resultArrayLen = resultArrayLen + (resultArrayLen >> 1);
    // 2.判断1.5倍的长度能否装下
    if(resultArrayLen - minLen < 0) {
      // 3.如果装不下，则数组长度不够，将所需要的最小长度赋值
      resultArrayLen = minLen;
    }
    // 4.数组扩容，创建一个新的长度的数组，并将之前的数组内容克隆到新数组中
    resultArray = this.copyArray(resultArrayLen);
  }

  /**
   * 将旧的数组，重新克隆到新的数组中
   * @param resultArrayLen 扩容之后数组的长度
   * @return 扩容之后的数组
   */
  private int[] copyArray(int resultArrayLen) {
    int[] newArr = new int[resultArrayLen];
    for(int i = 0; i < resultArray.length; i++) {
      newArr[i] = resultArray[i];
    }
    return newArr;
  }

  /**
   * 向数组中添加一个数值
   * @param num 添加的值
   * @return  是否添加成功
   */
  public boolean add (int num) {
    this.judgeArrayLen(size+1);
    resultArray[size++] = num;
    return true;
  }
}
