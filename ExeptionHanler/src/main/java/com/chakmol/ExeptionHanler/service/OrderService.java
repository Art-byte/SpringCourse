package com.chakmol.ExeptionHanler.service;

import com.chakmol.ExeptionHanler.dao.OrderDAO;
import com.chakmol.ExeptionHanler.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderDAO service;

    @PostConstruct
    public void addOrder(){
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(876, "Mobile", "Electronics", 8000));
        orders.add(new Order(876, "Mobile", "Electronics", 8000));
    }

    public int getPrice(String productName){
        Order order = service.findByName(productName);
        return order.getAmount();
    }
}
