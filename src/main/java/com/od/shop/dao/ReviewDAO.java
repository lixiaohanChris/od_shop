package com.od.shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.od.shop.pojo.Product;
import com.od.shop.pojo.Review;

public interface ReviewDAO extends JpaRepository<Review,Integer>{
	 
    List<Review> findByProductOrderByIdDesc(Product product);
    int countByProduct(Product product);
 
}