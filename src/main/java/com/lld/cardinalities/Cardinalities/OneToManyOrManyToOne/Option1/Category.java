package com.lld.cardinalities.Cardinalities.OneToManyOrManyToOne.Option1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

}

/*
Option 1 : category_id created in product table
 */