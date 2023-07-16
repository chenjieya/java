package bank;

public class Toff extends Person {

    public Toff() {}
    public Toff(String name){
        this.name = name;
    }

    public void callNumber() {
        System.out.println(this.name+"客户进入大厅");
    }

    public void transact() {
        System.out.println("排队中");
    }

    public void leave() {
        System.out.println("办理完业务离开");
    }
}
