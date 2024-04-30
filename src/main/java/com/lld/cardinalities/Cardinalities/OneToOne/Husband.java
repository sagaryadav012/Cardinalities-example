package com.lld.cardinalities.Cardinalities.OneToOne;

import jakarta.persistence.*;

//@Entity
public class Husband {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

//     It creates wife_id in husband table
//    @OneToOne
//    Wife wife;


    @OneToOne(mappedBy = "husband") // It tells mapping is done by husband, so ignore this relation.
    Wife wife;
}
