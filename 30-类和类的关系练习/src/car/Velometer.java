package car;

public class Velometer {
    private int standerTime = 5; // 测速的标准速度

    public void cesu(Car car) {
        int carSpeed = car.getCarSpeed();
        int carTime = 100 / carSpeed;

        if (carTime < this.standerTime) {
            // 超速
            System.out.println("超速了，警车可以开始追击了");
            PoliceCar policeCar = new PoliceCar(60);
            policeCar.pursueCar(car);
        } else{
            // 正常行驶
            System.out.println("速度正常，请按照正常速度行驶，注意驾驶安全");
        }
    }
}
