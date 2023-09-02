package com.shoppingApp.onlineShop.repository;

import com.shoppingApp.onlineShop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
