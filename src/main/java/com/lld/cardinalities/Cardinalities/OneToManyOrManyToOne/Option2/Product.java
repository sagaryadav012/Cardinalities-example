package com.lld.cardinalities.Cardinalities.OneToManyOrManyToOne.Option2;

import jakarta.persistence.*;

//@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
