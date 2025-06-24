package com.Joane.santander_api_2025.domain;

import jakarta.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private String agency;
    private Double balance;
    @Column(name = "account_limit") //resolvido problema da palava reservada 'limit'
    private Double limitValue;


    //add getters e setters
}
