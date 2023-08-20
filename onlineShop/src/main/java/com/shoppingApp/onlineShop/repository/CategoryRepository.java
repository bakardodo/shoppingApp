package com.shoppingApp.onlineShop.repository;

import com.shoppingApp.onlineShop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
