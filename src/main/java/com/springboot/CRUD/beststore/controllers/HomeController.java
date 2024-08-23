package com.springboot.CRUD.beststore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.CRUD.beststore.models.Product;
import com.springboot.CRUD.beststore.services.ProductsRepository;

@Controller
public class HomeController {
	@Autowired
	private ProductsRepository repo;

	@GetMapping("")
	public String viewHomePage(Model model) {
		List<Product> products = repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
		model.addAttribute("products", products);
		return "index";
	}

    @GetMapping("/shop")
    public String viewShopPage() {
        return "shop";
    }

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
