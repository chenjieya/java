package myEnum;

public enum Day {
    Monday("星期一", 1),Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;

    private String name;
    private int index;

    private Day(){};
    private Day(String name, int index) {
        this.index = index;
    };

    public String getName() {
        return this.name;
    }
}
