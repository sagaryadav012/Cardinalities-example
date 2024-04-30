package com.lld.cardinalities.Cardinalities.OneToManyOrManyToOne.Option3;

import jakarta.persistence.*;

//@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne // It creates category_id column in Product
    private Category category;
}
