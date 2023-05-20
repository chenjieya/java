package contains;

public class Car {
    public String brand; // 型号
    public String name; // 名字
    public Wheel wheel; // 轮胎

    public Car() {}
    public Car(String brand, String name, Wheel wheel) {
        this.brand = brand;
        this.name = name;
        this.wheel = wheel;
    }

    public void shengchan() {
        System.out.println("今天生产了一个汽车，他的名字是：" + name+"他的型号是"+brand);
        System.out.println("今天生产了一个轮胎，他的名字是：" + wheel.name+"他的型号是"+wheel.brand+"他的颜色是:"+wheel.color);
    }
}
