package com.od.shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.od.shop.pojo.Product;
import com.od.shop.pojo.Property;
import com.od.shop.pojo.PropertyValue;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{
	 
    List<PropertyValue> findByProductOrderByIdDesc(Product product);
    PropertyValue getByPropertyAndProduct(Property property, Product product);
 
}