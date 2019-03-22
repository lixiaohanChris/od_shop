package com.od.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.od.shop.pojo.Order;

public interface OrderDAO extends JpaRepository<Order,Integer>{
}
