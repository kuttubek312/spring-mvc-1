package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class DaoCarImpl implements DaoCar {

    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1,"BMW","e34","black",350000));
        cars.add(new Car(2,"AUDI","a6","yellow",650000));
        cars.add(new Car(3,"MERS","e500","black",550000));
        cars.add(new Car(4,"TESLA","mini","white",850000));
        cars.add(new Car(5,"TOYOTA","camry","black",950000));

    }

    @Override
    public List<Car> getByNum(int num) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (num > 5){
                return cars;
            }else {
                carList.add(cars.get(i));
            }
        }
        return carList;
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
