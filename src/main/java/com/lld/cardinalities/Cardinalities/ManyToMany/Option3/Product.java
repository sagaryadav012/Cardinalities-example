package com.lld.cardinalities.Cardinalities.ManyToMany.Option3;

import jakarta.persistence.*;

import java.util.List;

//@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany
    private List<Tag> tags;
}

/*
Option 3 : two separate mapping table will be created(tag_products, product_tags)
 */