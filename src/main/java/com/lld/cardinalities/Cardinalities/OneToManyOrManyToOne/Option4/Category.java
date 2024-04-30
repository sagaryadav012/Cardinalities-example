package com.lld.cardinalities.Cardinalities.OneToManyOrManyToOne.Option4;

import jakarta.persistence.*;

import java.util.List;

//@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "category") // It tells mapping is done by category in Product, so ignore this mapping
    private List<Product> productList;

}
