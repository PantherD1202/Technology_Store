package com.springboot.CRUD.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.CRUD.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
