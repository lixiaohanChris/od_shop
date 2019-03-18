package com.od.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.od.shop.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{
	 
}