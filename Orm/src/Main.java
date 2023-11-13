import Dao.CarDao;
import Domain.CarClass;
import Server.CarServer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CarClass cc = new CarClass(null, "BYD", "Black", 300.00);
        CarDao cd = new CarDao();
        cd.insert(cc);
    }
}