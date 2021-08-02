package com.chakmol.ExeptionHanler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "amout")
    private int amount;

    public Order(String name, String category, int amount){
        this.name = name;
        this.category = category;
        this.amount = amount;
    }


}
