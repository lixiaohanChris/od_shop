package com.od.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.od.shop.dao.UserDAO;
import com.od.shop.pojo.User;
import com.od.shop.util.Page4Navigator;

@Service
public class UserService {
 
    @Autowired UserDAO userDAO;
 
    public boolean isExist(String name) {
        User user = getByName(name);
        return null!=user;
    }
 
    public User getByName(String name) {
        return userDAO.findByName(name);
    }
 
    public User get(String name, String password) {
        return userDAO.getByNameAndPassword(name,password);
    }
 
    public Page4Navigator<User> list(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size,sort);
        Page pageFromJPA =userDAO.findAll(pageable);
        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }
 
    public void add(User user) {
        userDAO.save(user);
    }
 
}