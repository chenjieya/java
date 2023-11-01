// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Warehouse house = new Warehouse();
        Producer pr = new Producer(house);
        Consume c1 = new Consume(house);
        Consume c2 = new Consume(house);

        pr.setPriority(10);

        pr.start();
        c1.start();
        c2.start();
    }
}