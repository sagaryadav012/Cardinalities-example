package com.lld.cardinalities.Cardinalities.ManyToMany.Option3;

import jakarta.persistence.*;

import java.util.List;

//@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany
    private List<Product> products;
}
