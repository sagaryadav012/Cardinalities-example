package com.lld.cardinalities.Cardinalities.OneToManyOrManyToOne.Option2;

import jakarta.persistence.*;

import java.util.List;

//@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany // It creates new mapping table.
    private List<Product> productList;
}

/*
Option 2 : new mapping table will be created.
 */