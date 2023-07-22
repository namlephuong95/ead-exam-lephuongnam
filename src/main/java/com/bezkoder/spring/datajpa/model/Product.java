package com.bezkoder.spring.datajpa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "product")
@JsonIgnoreProperties
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "prodID")
    private long prodID;
    @Column(name = "prodName", unique = true)
    private String prodName;
    @Column(name = "description")
    private String description;
    @Column(name = "dateOfManf")
    private String dateOfManf;
    @Column(name = "price")
    private double price;

    public Product() {
    }

    public Product(long prodID, String prodName, String description, String dateOfManf, double price) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.description = description;
        this.dateOfManf = dateOfManf;
        this.price = price;
    }

    public long getProdID() {
        return prodID;
    }

    public void setProdID(long prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateOfManf() {
        return dateOfManf;
    }

    public void setDateOfManf(String dateOfManf) {
        this.dateOfManf = dateOfManf;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodID=" + prodID +
                ", prodName='" + prodName + '\'' +
                ", description='" + description + '\'' +
                ", dateOfManf='" + dateOfManf + '\'' +
                ", price=" + price +
                '}';
    }
}
