package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiseImpl implements CarService{

    private List<Car> listCars;
    {
        listCars = new ArrayList<>();
        listCars.add(new Car("1", "red", "11"));
        listCars.add(new Car("2", "green", "32"));
        listCars.add(new Car("3", "blue", "33"));
        listCars.add(new Car("4", "red1", "44"));
        listCars.add(new Car("5", "green2", "55"));
        listCars.add(new Car("6", "blue3", "66"));
    }

    public List<Car>index(){
        return listCars;
    }
    public List<Car> getCars(int count){
        List<Car>carListCount = new ArrayList<>();
        for (int i = 0; i < count ; i++) {
            carListCount.add(listCars.get(i));

        }return carListCount;
    }

}

