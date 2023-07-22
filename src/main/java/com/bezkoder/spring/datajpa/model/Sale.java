package com.bezkoder.spring.datajpa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import java.util.List;

@Entity
@Table(name = "sale",
uniqueConstraints = {@UniqueConstraint(columnNames = { "salesmanID", "prodID" })})
@JsonIgnoreProperties
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SlNo")
    private long slNo;
    @Column(name = "salesmanID", unique = true)
    private String salesmanID;
    @Column(name = "prodID")
    private long prodID;
    @Column(name = "salesmanName")
    private String salesmanName;
    @Column(name = "dos")
    private String dos;

    public Sale() {
    }

    public Sale(long slNo, String salesmanID, long prodID, String salesmanName, String dos) {
        this.slNo = slNo;
        this.salesmanID = salesmanID;
        this.prodID = prodID;
        this.salesmanName = salesmanName;
        this.dos = dos;
    }

    public long getSlNo() {
        return slNo;
    }

    public void setSlNo(long slNo) {
        this.slNo = slNo;
    }

    public String getSalesmanID() {
        return salesmanID;
    }

    public void setSalesmanID(String salesmanID) {
        this.salesmanID = salesmanID;
    }

    public long getProdID() {
        return prodID;
    }

    public void setProdID(long prodID) {
        this.prodID = prodID;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }
}
