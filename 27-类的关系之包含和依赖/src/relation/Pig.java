package relation;

public class Pig {
    // 猪
    public String name; // 猪的名字
    public int weight = 20; // 20斤

    public Pig() {}
    public Pig(String name) {
        this.name = name;
    }

    /**
     * 猪被杀的方法
     */
    public void beKilled() {
        System.out.println(name + "被杀了，好惨啊");
    }

    /**
     * 养猪的方法，一个月是上个月的2倍
     * @param month 猪被养的月数
     */
    public void growUp(int month) {
        for (int i = 0; i < month; i++) {
            this.weight = this.weight << 1;
        }
    }

    /**
     * 获取猪的名字
     */
    public String getName() {
        return this.name;
    }

    /**
     * 获取猪的体重
     * @return 猪的体重
     */
    public int getWeight() {
        return this.weight;
    }
}
