package com.example.demo.dao;

import com.example.demo.models.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO {
    private static final List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Name1", 11, 11));
        carList.add(new Car("Name2", 12, 12));
        carList.add(new Car("Name3", 13, 13));
        carList.add(new Car("Name4", 14, 14));
        carList.add(new Car("Name5", 15, 15));
        carList.add(new Car("Name6", 16, 16));
        carList.add(new Car("Name7", 17, 17));
        carList.add(new Car("Name8", 18, 18));
        carList.add(new Car("Name9", 19, 19));
        carList.add(new Car("Name10", 10, 10));
    }

    public List<Car> partOfCarsList(int count) {
        if (count > 10 || count < 1) {
            return null;
        }
        List<Car> partOfList = new ArrayList<>();
        for (int i = 0; i < count; i++){
            partOfList.add(carList.get(i));
        }
        return partOfList;
    }

}
