package com.od.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.od.shop.pojo.User;

public interface UserDAO extends JpaRepository<User,Integer>{
	 
}
