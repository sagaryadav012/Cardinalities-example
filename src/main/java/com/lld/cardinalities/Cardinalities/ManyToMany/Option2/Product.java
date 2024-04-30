package com.lld.cardinalities.Cardinalities.ManyToMany.Option2;

import jakarta.persistence.*;

import java.util.List;

//@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

}

/*
Option 2 : separate mapping table will be created(tag_products)
 */