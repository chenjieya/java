package gc;

public class Main {
    public static void main(String[] args) {
        Gc gcc = new Gc();
        gcc = null;
        try{
            Thread.sleep(2000);
        }catch(Exception e) {

        }
        System.gc();


        // Runtime类
        /**
         * max是堆内存的所有字节存储空间大小
         * total是准备好的区域的所有空间大小（可用的+空闲的）
         * free空间的存储区域
         *
         * 准备好的区域就是好比餐厅，晚上的时候没有那么多的客人，整个吃饭的地方很大，分为一二两层，但是晚上客人少，只开放一楼
         */
        Runtime rt = Runtime.getRuntime();

        long max = rt.maxMemory();
        long total = rt.totalMemory();
        long free = rt.freeMemory();
        System.out.println(max);
        System.out.println(total);
        System.out.println(free);
        System.out.println("------------------------------");
        byte[] by = new byte[10000];
        long max1 = rt.maxMemory();
        long total1 = rt.totalMemory();
        long free1 = rt.freeMemory();
        System.out.println(max1);
        System.out.println(total1);
        System.out.println(free1);


    }
}
