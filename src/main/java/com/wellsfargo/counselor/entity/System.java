package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class System {

    @Id
    @GeneratedValue()
    private long systemID;

    @Column(nullable = false)
    private String uptime;

    protected System() {
    }

    public System(String uptime) {
        this.uptime = uptime;
    }

    public Long getSystemID() {
        return systemID;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String getUptime) {
        this.uptime = uptime;
    }
}
