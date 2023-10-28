package Stack;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        boolean flag = st.empty();  // 判断该栈是否为空
        System.out.println(flag);  // true

        // 	push(E item):E
        st.push(1);
        boolean flag1 = st.empty();
        System.out.println(flag1);  // false
        System.out.println(st);  // [1]

        // 	search(Object o) 查找。返回索引
        st.push(12);
        int index = st.search(12);
        System.out.println(index);  // 1
        int index1 = st.search(100);
        System.out.println(index1);  // -1
        System.out.println(st);  // [1, 12]

        // 	pop():E  删除顶部的对象，也就是最后一个添加进来的
        System.out.println(st);  // [1, 12]
        st.pop();
        System.out.println(st); // [1]

        // 	peek():E  查看位于栈顶部的对象，也就是最后一个添加进来的对象， 但是不能将其移除
        Integer last = st.peek();
        System.out.println(last);
    }
}
