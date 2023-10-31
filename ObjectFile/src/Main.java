import java.io.*;

public class Main {
    public static void main(String[] args) {

        // 将对象序列化
//        try {
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\java\\IO_FILE_TEST\\person.txt"));
//
//            oos.writeObject(new Person("alvis", 18));   // 将对象序列化到文件内
//            oos.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        // 将对象反序列化
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\java\\IO_FILE_TEST\\person.txt"));
            Person p = (Person)ois.readObject();
            System.out.println(p);
            p.eat();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}