package com.example.library.management.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int membId;

    private String name;
    private String address;
    private String membType;
    private Date membDate;
    private Date expiryDate;

    public Member() {}

    public Member(String name, String address, String membType, Date membDate, Date expiryDate) {
        this.name = name;
        this.address = address;
        this.membType = membType;
        this.membDate = membDate;
        this.expiryDate = expiryDate;
    }

    public int getMembId() {
        return membId;
    }

    public void setMembId(int membId) {
        this.membId = membId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMembType() {
        return membType;
    }

    public void setMembType(String membType) {
        this.membType = membType;
    }

    public Date getMembDate() {
        return membDate;
    }

    public void setMembDate(Date membDate) {
        this.membDate = membDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
