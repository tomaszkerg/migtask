package com.example.demo;

import javax.persistence.*;

@Entity
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer floors;

    @ManyToOne
    private City city;
}
