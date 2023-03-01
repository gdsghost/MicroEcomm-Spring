package com.sudamyasodya.orderservice.repository;

import com.sudamyasodya.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
