package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCar(@RequestParam(value = "count", defaultValue = "5", required = false) Integer count, Model model) {
        model.addAttribute("tableCars", carService.getCars(carService.getCarsList(), count));
        return "cars";
    }
}
