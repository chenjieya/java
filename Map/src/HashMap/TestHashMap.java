package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // 增  	put(K key, V value):V
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "a");
        map.put(4, "c");
        System.out.println(map);  // {1=a, 2=b, 3=a, 4=c}

        // 	putIfAbsent(K key, V value): null | V 判断是否有当前属性，如果存在则返回当前值，不存在则新增
        String a = map.putIfAbsent(3, "aa");  // 存在
        System.out.println(a);  // a
        map.putIfAbsent(5, "bb");
        System.out.println(map);  // {1=a, 2=b, 3=a, 4=c, 5=bb}

        // 删  	remove(Object key):V
        String v = map.remove(2);  // 属性存在
        String b = map.remove(100);  // 属性不存在
        System.out.println(v);  // b
        System.out.println(b); // null

        // remove(Object key, Object value)：boolean
        map.remove(3, "a");
        System.out.println(map);


        // 改  	replace(K key, V value):V
        map.replace(3, "aaa"); //只能更改已经存在的， 否则没有任何效果
        map.replace(5, "bbb");
        System.out.println(map);  // {1=a, 4=c, 5=bbb}

        // 查 	get(Object key):V
        String c = map.get(5);
        System.out.println(c);  // bbb

        // getOrDefault(Object key, V defaultValue):V  返回指定属性的值，如果属性不存在则返回给定的默认值
        String d = map.getOrDefault(5, "5");
        String e = map.getOrDefault(100, "100");
        System.out.println(d);  // bbb
        System.out.println(e);  // 100


        // 	keySet():Set<K>
        Set<Integer> keys = map.keySet();

        for (Integer key : keys) {
            String item = map.get(key);
            System.out.println(item);  // a c bbb
        }

        // 	entrySet():Set<Map.Entry<K,V>>
        Set<Map.Entry<Integer, String>> key = map.entrySet();
        System.out.println(key);  // [1=a, 4=c, 5=bbb]
//        Iterator<Map.Entry<Integer, String>> iterator = key.iterator();

        for (Map.Entry<Integer, String> item : key) {
            Integer ke = item.getKey();
            String val = item.getValue();
            System.out.println(ke + ":" + val );
        }

    }
}
