package com.springboot.CRUD.beststore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.CRUD.beststore.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}