package com.od.shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.od.shop.pojo.Order;
import com.od.shop.pojo.User;

public interface OrderDAO extends JpaRepository<Order,Integer>{
	public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}
