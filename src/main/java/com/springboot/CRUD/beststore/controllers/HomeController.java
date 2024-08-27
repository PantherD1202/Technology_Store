package com.springboot.CRUD.beststore.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.CRUD.beststore.models.Category;
import com.springboot.CRUD.beststore.models.Fruit;
import com.springboot.CRUD.beststore.services.CategoryService;
import com.springboot.CRUD.beststore.services.FruitService;

@Controller
public class HomeController {
    @Autowired
    private FruitService fruitService;
    @Autowired
    private CategoryService categoryService;
    // @GetMapping("")
    // public String viewHomePage(Model model) {
    // List<Product> products = repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
    // model.addAttribute("products", products);
    // return "index";
    // }
    
    // * this is a shop page but no pagination */
    // @GetMapping("/shop")
    // public String viewShopPage(Model model) {
    // List<Fruit> fruits = fruitService.getAllFruits();
    // model.addAttribute("fruits", fruits);
    // return "shop";
    // }

    @GetMapping("/shop-detail")
    public String viewShopDetailPage() {
        return "shop-detail";
    }

    @GetMapping("/cart")
    public String viewCartPage() {
        return "cart";
    }

    @GetMapping("/chackout")
    public String viewCheckoutPage() {
        return "chackout";
    }

    @GetMapping("/testimonial")
    public String viewTestimonialPage() {
        return "testimonial";
    }

    @GetMapping("/404")
    public String view404Page() {
        return "404";
    }

    @GetMapping("/contact")
    public String viewContactPage() {
        return "contact";
    }
}
