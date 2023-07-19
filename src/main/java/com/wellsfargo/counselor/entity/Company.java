package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Company {

    @Id
    @GeneratedValue()
    private long companyID;

    @Column(nullable = false)
    private String companyName;

    protected Company() {
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public Long getCompanyID() {
        return companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
