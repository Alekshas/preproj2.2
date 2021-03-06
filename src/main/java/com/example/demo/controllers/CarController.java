package com.example.demo.controllers;

import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/cars", method = RequestMethod.GET)
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping
    public String carsPart(@RequestParam(required = false) Integer count, Model model) {
        carService.partOfAttribute(count, model);
        return "cars";
    }

}
