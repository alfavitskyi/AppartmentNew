package com.accessingdatamysql;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @Column(name = "appartment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "appart_numb")
    private int apartNum;
    @Column (name = "appart_square")
    private Double apartSquare;
    @Column (name = "appart_debt")
    private Double debt;
    @Column (name = "appart_paysumm")
    private Double paySumm;
    @Column(name = "appart_email")
    private String apartEmail;
    @Column (name = "appart_quantitypeopl")
    private int quantityPeople;

    public int getQuantityPeople() {
        return quantityPeople;
    }

    public void setQuantityPeople(int quantityPeople) {
        this.quantityPeople = quantityPeople;
    }

    public int getquantityPeople() {
        return quantityPeople;
    }

    public void setquantityPeople(int quantityPeople) {
        this.quantityPeople = quantityPeople;
    }

    public String getApartEmail() {
        return apartEmail;
    }

    public void setApartEmail(String apartEmail) {
        this.apartEmail = apartEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getApartNum() {
        return apartNum;
    }

    public void setApartNum(int apartNum) {
        this.apartNum = apartNum;
    }

    public Double getApartSquare() {
        return apartSquare;
    }

    public void setApartSquare(Double apartSquare) {
        this.apartSquare = apartSquare;
    }

    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }

    public Double getPaySumm() {
        return paySumm;
    }

    public void setPaySumm(Double paySumm) {
        this.paySumm = paySumm;
    }
}
