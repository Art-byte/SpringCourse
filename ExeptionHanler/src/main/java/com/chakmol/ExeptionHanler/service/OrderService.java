package com.chakmol.ExeptionHanler.service;

import com.chakmol.ExeptionHanler.dao.OrderDAO;
import com.chakmol.ExeptionHanler.exception.OrderServiceException;
import com.chakmol.ExeptionHanler.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderDAO dao;

    @PostConstruct
    public void addOrder(){
        List<Order> ordenes = new ArrayList<>();
        ordenes.add(new Order("mike","Entretenimiento",123));
        dao.saveAll(ordenes);
    }

    public int getPrice(String productName) throws OrderServiceException {
        Order order = null;
        int amout = 0;
        try{
            order = dao.findByName(productName);
            amout = order.getAmount();
        }catch(Exception e){
            throw new OrderServiceException("order not found with product");
        }

        return amout;
    }
}
