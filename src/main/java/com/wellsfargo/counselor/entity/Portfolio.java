package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private String dateOfIssue;


    protected Portfolio() {

    }

    public Portfolio(String portfolioName, String dateOfIssue) {
        this.portfolioName = portfolioName;
        this.dateOfIssue = dateOfIssue;
    }

    public Long portfolioID() {
        return portfolioID;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }
}

