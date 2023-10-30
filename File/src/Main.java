import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File file = new File("G:\\java\\IO_FILE_TEST\\test.txt");

        // canRead():boolean  是否可读
        System.out.println(file.canRead());  // true
        // canWrite():boolean  是否可写
        System.out.println(file.canWrite());  // true
        // isHidden():boolean  是否隐藏
        System.out.println(file.isHidden());  // false
        // length():long  文件字节数
        System.out.println(file.length());  // 5
        // isFile():boolean  是否是文件
        System.out.println(file.isFile());  // true
        // isDirectory():boolean  是否是文件夹
        System.out.println(file.isDirectory());  // false
        // 	lastModified():long  最后一次修改的时间
        long time = file.lastModified();   // 时间戳
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);   // 最后一次修改时间 2023-10-30 09:01:13

        // 	getAbsolutePath():String 获取文件的绝对路径
        System.out.println(file.getAbsolutePath()); //G:\java\IO_FILE_TEST\test.txt

        // 	getAbsoluteFile():file 返回的是文件对象
        File file1 = file.getAbsoluteFile();
        System.out.println(file1); // G:\java\IO_FILE_TEST\test.txt
        System.out.println(file1.getAbsolutePath());  // G:\java\IO_FILE_TEST\test.txt
        System.out.println(file1.isFile());  // true

        // 	getName():String 获取文件/目录的名字
        System.out.println(file.getName());  // test.txt


        File file2 = new File("G:\\java\\IO_FILE_TEST\\test");

        // 	mkdir():boolean  创建新的文件夹，外层文件夹如果不存在的话，内层的也不会被创建
        System.out.println(file2.mkdir());  // true

        // abc文件夹不存在
        File file3 = new File("G:\\java\\IO_FILE_TEST\\abc\\test");
        System.out.println(file3.mkdir());  // false

        // mkdirs():boolean  弥补了上面的缺点，外层文件夹如果不存在则可以自动创建
        System.out.println(file3.mkdirs());  // true

        // getParent():String 获取当前file文件的父亲的file名字
        System.out.println(file3.getParent()); // G:\java\IO_FILE_TEST\abc
        // getParents():file  获取当前file文件的父亲的file文件
        File file4 = file3.getParentFile();
        System.out.println(file4);  // G:\java\IO_FILE_TEST\abc
        System.out.println(file4.isFile());  // false

        // list():String[]  获取当前file所有儿子的名字，竟然是获取儿子的
        File file5 = new File("G:\\java\\IO_FILE_TEST\\abc\\test\\abc.txt");
        try{
            boolean flag = file5.createNewFile();  // 创建文件
            System.out.println(flag);  //true
        }catch (Exception e) {
            e.printStackTrace();
        }
        File file6 = new File("G:\\java\\IO_FILE_TEST");
        String[] son = file6.list();
        for (String s : son) {
            System.out.println(s);  // abc  test test.txt
        }

        File[] files = file6.listFiles();
        System.out.println(files);

        // 	delete():boolean  删除文件或空的文件夹 不能删除带元素的文件夹
        System.out.println(file5.delete());  // true
        System.out.println(file6.delete());  // false

    }
}