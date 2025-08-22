package com.example.demo.order;

import com.example.demo.Users.User;
import org.hibernate.query.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer> {
    Orders findById(int id);
    void deleteById(Integer id);
    List<Orders> findOrdersByUser(User user);
    List<Orders> findAll();





}
