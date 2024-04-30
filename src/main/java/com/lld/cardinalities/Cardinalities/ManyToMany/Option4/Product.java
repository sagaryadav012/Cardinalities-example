package com.lld.cardinalities.Cardinalities.ManyToMany.Option4;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(mappedBy = "products")
    List<Tag> tags;
}
/*
Option 4 : only one separate mapping table will be created(tag_products)
 */