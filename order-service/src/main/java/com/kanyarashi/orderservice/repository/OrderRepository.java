package com.kanyarashi.orderservice.repository;

import com.kanyarashi.orderservice.model.Order;
import com.kanyarashi.orderservice.service.OrderService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
