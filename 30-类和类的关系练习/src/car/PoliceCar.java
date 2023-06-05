package car;

public class PoliceCar {
    private int speed;

    public PoliceCar() {}
    public PoliceCar(int speed) {
        this.speed = speed;
    }

    /**
     * 警车追击汽车
     */
    public void pursueCar(Car car) {
        int carSpeed = car.getCarSpeed();
        if (this.speed > carSpeed) {
            int time = 100 / (this.speed - carSpeed);
            System.out.println("警车经过"+time+"s追上小汽车");
        } else{
            System.out.println("很遗憾，警车配置太低了，追不上已经超速的小汽车");
        }
    }
}
