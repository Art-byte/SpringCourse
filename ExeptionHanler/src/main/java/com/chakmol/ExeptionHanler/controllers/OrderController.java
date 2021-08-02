package com.chakmol.ExeptionHanler.controllers;

import com.chakmol.ExeptionHanler.exception.OrderServiceException;
import com.chakmol.ExeptionHanler.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getPrice/{productName}")
    public String getOrderPrice(@PathVariable("productName") String productName) throws OrderServiceException {
        int amount = orderService.getPrice(productName);
        return "amout for product " + productName + "is " + amount;
    }
}
