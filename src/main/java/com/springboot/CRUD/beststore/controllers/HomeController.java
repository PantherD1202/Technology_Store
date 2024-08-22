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
		return "home";
	}
}
