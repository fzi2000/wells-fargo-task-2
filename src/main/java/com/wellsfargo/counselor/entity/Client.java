package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private String clientName;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private int numPortfolio;

    @Column(nullable = false)
    private String contactNum;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    private FinancialAdvisor advisor;

    protected Client() {
    }

    public Client(String clientName, String companyName, int numPortfolio, String contactNum, String email, FinancialAdvisor advisor) {
        this.clientName = clientName;
        this.companyName = companyName;
        this.numPortfolio = numPortfolio;
        this.contactNum = contactNum;
        this.email = email;
        this.advisor = advisor;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientNam) {
        this.clientName = clientName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNumPortfolio() {
        return numPortfolio;
    }

    public void setNumPortfolio(int numPortfolio) {
        this.numPortfolio = numPortfolio;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FinancialAdvisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(FinancialAdvisor advisor) {
        this.advisor = advisor;
    }
}
