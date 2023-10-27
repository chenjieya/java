import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(list);

        list.add(1, 3);
        //list.add(6, 8);  // 报错: IndexOutOfBoundsException
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(12);
//        list.addAll(list1);  // 将list1合并到list中的后面
//        System.out.println(list);  // [1, 3, 2, 1, 10, 12]

        list.addAll(1, list1);
        System.out.println(list);  // [1, 10, 12, 3, 2, 1]


//        list.clear();
//        System.out.println(list);

        Object listClone = list.clone();
        System.out.println(listClone);
        System.out.println(list.equals(listClone));   // true

        list.set(0, 100);
        System.out.println(listClone);

        boolean flag = list.contains(2);
        System.out.println(flag);


        // 	get(int index):E   	get(Object o):E

        Integer a = list.get(0);
        System.out.println(a);

        Integer b = list.get(0);
        System.out.println(b);

        // 	indexOf(Object o):int
        int c = list.indexOf(100);
        System.out.println(list);  // [100, 10, 12, 3, 2, 1]
        System.out.println(c);   // 0

        // 	isEmpty()
        boolean d = list.isEmpty();
//        list1.clear();
        boolean e = list1.isEmpty();
        System.out.println(list);  // [100, 10, 12, 3, 2, 1]
        System.out.println(list1);  // []
        System.out.println(d);  // false
        System.out.println(e);  // true


        // lastIndexOf(Object o):int 返回此元素在集合中最后出现的位置的索引，如果没出现返回-1
        list.set(0, 2);
        int f = list.lastIndexOf(2);
        int g = list.lastIndexOf(100);
        System.out.println(list);  // [2, 10, 12, 3, 2, 1]
        System.out.println(f);  // 4
        System.out.println(g);  // -1

        // remove(int index) | 	remove(Object o)
        System.out.println(list);
        list.remove(1);
        System.out.println(list);   // [2, 12, 3, 2, 1]
        list.remove(new Integer(2));
        System.out.println(list);  // [12, 3, 2, 1]

        // 	removeAll(Collection<?> c):boolean  从A集合中删除B集合的内容(差集)
//        System.out.println(list);  // [12, 3, 2, 1]
//        System.out.println(list1);  // [10, 12]
//        list.removeAll(list1);
//        System.out.println(list);  // [3, 2, 1]


        // 	retainAll(Collection<?> c)  交集
//        System.out.println(list);  // [12, 3, 2, 1]
//        System.out.println(list1);  // [10, 12]
//        list.retainAll(list1);
//        System.out.println(list);  // [12]
//        list.set(0, 14);
//        System.out.println(list);

        System.out.println(list);  // [12, 3, 2, 1]
        int h = list.size();
        System.out.println(h);  // 4

        // 	subList(int fromIndex, int toIndex):List<E>  截取数组 区间 [)
        System.out.println(list);  // [12, 3, 2, 1]
        List<Integer> list3 = list.subList(1,3);
        System.out.println(list3);  // [3, 2]



        // toArray():Object[] | toArray(T[] a):<T> T[] 将集合变成数组
        System.out.println(list);  // [12, 3, 2, 1]
        Object[] arr = list.toArray();
        for (Object o:arr) {
            Integer val = (Integer) o;
            System.out.println(val);
        }

        Integer[] arr1 = new Integer[list.size()]; // 先把房开好
        list.toArray(arr1);  // 集合里面的娘们，一个个的脱光衣服走进来 变成了数组
        for (Integer o:arr1) {
            System.out.println(o);
        }


    }
}