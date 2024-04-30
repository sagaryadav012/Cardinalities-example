package com.lld.cardinalities.Cardinalities.OneToOne;

import jakarta.persistence.*;

//@Entity
public class Wife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

//     It creates wife_id in husband table
//    @OneToOne
//    Husband husband;

    @OneToOne
    Husband husband;
}
