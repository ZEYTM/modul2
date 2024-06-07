package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiseImpl;

@Controller
public class CarController {


    private CarServiseImpl carServiseImpl;

    @Autowired
    public CarController(CarServiseImpl carServise) {
        this.carServiseImpl = carServise;
    }

    @GetMapping("/cars")
    public String showCar(@RequestParam(name = "count",required = false) Integer count,
                          Model model) {
        if ( count == null || count >= 5) {
            model.addAttribute("carList", carServiseImpl.index());
        } else {
            model.addAttribute("carList", carServiseImpl.getCars(count));
        }
        return "cars";
    }


}
