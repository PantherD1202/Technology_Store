package com.springboot.CRUD.beststore.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.CRUD.beststore.models.Fruit;
import com.springboot.CRUD.beststore.services.FruitService;

@Controller
public class FruitController {
    @Autowired
    private FruitService fruitService;

    @GetMapping("")
    public String listFruits(Model model) {
        List<Fruit> fruits = fruitService.getAllFruits();
        model.addAttribute("fruits", fruits);
        return "test";
    }
}
