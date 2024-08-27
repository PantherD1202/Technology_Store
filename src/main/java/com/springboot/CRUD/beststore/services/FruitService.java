package com.springboot.CRUD.beststore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.springboot.CRUD.beststore.models.Category;
import com.springboot.CRUD.beststore.models.Fruit;
import com.springboot.CRUD.beststore.repository.FruitRepository;

@Service
public class FruitService {
  @Autowired
  private FruitRepository fruitRepository;

  public List<Fruit> getAllFruits() {
    return fruitRepository.findAll();
  }

  public List<Fruit> getFruitsByCategory(Category category) {
    return fruitRepository.findByCategory(category);
  }

  public List<Fruit> searchFruitsByKeyword(String keyword) {
    return fruitRepository.findByNameContainingIgnoreCase(keyword);
  }
}
