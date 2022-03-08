package com.example.demo.service;

import com.example.demo.dao.CarsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CarService {
    @Autowired
    private CarsDAO carsDAO;

    @Value("${maxCar}")
    int maxCar;

    public void partOfAttribute(Integer count, Model model) {
        if (count != null && count < maxCar) {
            model.addAttribute("cars", carsDAO.partOfCarsList(count));
        } else
            model.addAttribute("cars", carsDAO.partOfCarsList(10));
    }
}
