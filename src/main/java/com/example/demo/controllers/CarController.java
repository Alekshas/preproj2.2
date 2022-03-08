package com.example.demo.controllers;

import com.example.demo.dao.CarsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/cars", method = RequestMethod.GET)
public class CarController {
    @Autowired
    private CarsDAO carsDAO;

    @GetMapping
    public String carsPart(@RequestParam(defaultValue = "-1") int count, Model model) {
        if (count != -1 && count < 5) {
            model.addAttribute("cars", carsDAO.partOfCarsList(count));
        } else
            model.addAttribute("cars", carsDAO.partOfCarsList(10));
        return "cars";
    }

}
