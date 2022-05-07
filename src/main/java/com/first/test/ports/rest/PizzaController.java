package com.first.test.ports.rest;

import com.first.test.ports.PizzaRepository;
import com.first.test.models.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzaController {

    @Autowired
    PizzaRepository pizzaRepository;

//    @PostMapping("/add") // Map ONLY POST Requests
//    public String addNewUser(@RequestParam String base,
//                      @RequestParam String toppingNonVeg,
//                      @RequestParam String sauce,
//                      @RequestParam String toppingVeg) {
//
//        Pizza n = new Pizza(base, toppingNonVeg, toppingVeg, sauce);
//        n.setBase(base);
//        n.setSauce(sauce);
//        n.setToppingNonVeg(toppingNonVeg);
//        n.setToppingVeg(toppingVeg);
//        pizzaRepository.save(n);
//        return "Saved";
//    }

    @GetMapping("/pizza")
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }
}
