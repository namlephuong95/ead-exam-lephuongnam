package com.bezkoder.spring.datajpa.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class SaleDto implements Serializable {
    private final String salesmanID;
    private final long prodID;
    private final String salesmanName;
    private final String dos;
    private List<Product> productList;

    public SaleDto(String salesmanID, long prodID, String salesmanName, String dos, List<Product> productList) {
        this.salesmanID = salesmanID;
        this.prodID = prodID;
        this.salesmanName = salesmanName;
        this.dos = dos;
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getSalesmanID() {
        return salesmanID;
    }

    public long getProdID() {
        return prodID;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public String getDos() {
        return dos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleDto entity = (SaleDto) o;
        return Objects.equals(this.salesmanID, entity.salesmanID) &&
                Objects.equals(this.prodID, entity.prodID) &&
                Objects.equals(this.salesmanName, entity.salesmanName) &&
                Objects.equals(this.dos, entity.dos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesmanID, prodID, salesmanName, dos);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "salesmanID = " + salesmanID + ", " +
                "prodID = " + prodID + ", " +
                "salesmanName = " + salesmanName + ", " +
                "dos = " + dos + ")";
    }
}
