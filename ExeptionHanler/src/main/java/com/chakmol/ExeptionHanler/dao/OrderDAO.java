package com.chakmol.ExeptionHanler.dao;

import com.chakmol.ExeptionHanler.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDAO extends JpaRepository<Order, Integer> {
    Order findByName(String name);
}
