package com.lld.cardinalities.Cardinalities.ManyToMany.Option1;

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
Option1 : separate mapping table will be created(Product_tags)
 */