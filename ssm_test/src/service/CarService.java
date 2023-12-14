package service;

import dao.CarDao;
import domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarDao dao;

    public void addCars(List<Car> carList) {

        for (Car car : carList) {
            dao.addCar(car);
        }

    }


    public List<Car> findAll() {
        return dao.findAll();
    }

}
