package com.lld.cardinalities.Cardinalities.OneToManyOrManyToOne.Option3;

import jakarta.persistence.*;

import java.util.List;

//@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany // It creates mapping table.
    private List<Product> products;
}

/*
Option 3 : Both category_id created in product table and new mapping table will be created.
-> It leads to redundancy
 */