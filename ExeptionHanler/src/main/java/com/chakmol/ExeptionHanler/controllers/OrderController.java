package com.chakmol.ExeptionHanler.controllers;

import com.chakmol.ExeptionHanler.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    public String getOrderPrice(@PathVariable("productName") String productName){
        int amount = orderService.getPrice(productName);
        return "amout for product " + productName + "is " + amount;
    }
}
