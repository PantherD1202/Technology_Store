package com.springboot.CRUD.beststore.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.CRUD.beststore.models.Category;
import com.springboot.CRUD.beststore.models.Fruit;
import com.springboot.CRUD.beststore.services.CategoryService;
import com.springboot.CRUD.beststore.services.FruitService;

@Controller
public class ShopController {
    @Autowired
    private FruitService fruitService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/shop")
    public String viewShopPage(
            @RequestParam(value = "category", required = false) Long categoryId,
            @RequestParam(value = "search", required = false) String searchKeyword,
            Model model) {

        List<Fruit> fruits;

        if (searchKeyword != null && !searchKeyword.isEmpty()) {
            fruits = fruitService.searchFruitsByKeyword(searchKeyword);
        } else if (categoryId != null) {
            Category category = categoryService.findById(categoryId);
            fruits = fruitService.getFruitsByCategory(category);
        } else {
            fruits = fruitService.getAllFruits();
        }

        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("fruits", fruits);
        model.addAttribute("categories", categories);
        model.addAttribute("searchKeyword", searchKeyword); // For retaining the search keyword in the input field

        return "shop";
    }

}
