package com.od.shop.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.od.shop.pojo.Category;
import com.od.shop.pojo.Product;

public interface ProductDAO extends JpaRepository<Product,Integer>{
    Page<Product> findByCategory(Category category, Pageable pageable);
}
