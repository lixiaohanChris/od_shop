package com.od.shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.od.shop.pojo.Order;
import com.od.shop.pojo.OrderItem;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
}
