package com.springboot.CRUD.beststore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.springboot.CRUD.beststore.models.Category;
import com.springboot.CRUD.beststore.models.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Long>{
   List<Fruit> findByCategory(Category category);
   List<Fruit> findByNameContainingIgnoreCase(String name);
}
