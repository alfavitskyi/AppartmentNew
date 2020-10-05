package com.accessingdatamysql;


import javax.persistence.*;

@Entity
@Table
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String address;
    private Integer houseNumb;
    private Integer appQuantity;
}
