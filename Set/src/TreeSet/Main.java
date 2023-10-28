package TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> strSet = new TreeSet<>();
        strSet.add("A");
        strSet.add("a");
        strSet.add("B");
        strSet.add("b");
        System.out.println(strSet);  // [A, B, a, b]

        TreeSet<Person> personSet = new TreeSet<Person>();

        personSet.add(new Person("alvis", 1, 18));
        personSet.add(new Person("alvis", 2, 16));
        personSet.add(new Person("alvis", 3, 25));
        personSet.add(new Person("alvis", 4, 24));
        personSet.add(new Person("alvis", 5, 25));
        System.out.println(personSet);  // 报错  ClassCastException 造型错误

    }
}
