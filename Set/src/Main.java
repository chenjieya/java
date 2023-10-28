import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<String>();
        // 	add(E e):boolean
        strSet.add(new String("alvis"));
        strSet.add(new String("alvis"));
        strSet.add(new String("alvis"));
        System.out.println(strSet.size());  // 1


        HashSet<Person> personSet = new HashSet<Person>();
        personSet.add(new Person("alvis", 1));
        personSet.add(new Person("alvis", 2));
        personSet.add(new Person("alvis", 3));

//        System.out.println(personSet.size());  // 3

//        System.out.println(new Person("alvis").equals(new Person("alvis")));   // true

        System.out.println(personSet.size());  // 1

        System.out.println(personSet);   // [{alvis,1}]









//        strSet.clear();
//        System.out.println(strSet);  // []


//        boolean flag = strSet.contains("A");
//        System.out.println(flag);
//
//
//        // 	iterator():Iterator<E>
//        String str = strSet.iterator().next();
//        System.out.println(str);  // a
//
//        //	remove(Object o):boolean
//        strSet.remove("a");
//        System.out.println(strSet);  // [A, b, world, hello]

        // 	size()

    }
}