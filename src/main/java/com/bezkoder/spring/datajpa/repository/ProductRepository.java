package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select p from Product p where p.prodID in (select s.prodID from Sale s where upper(s.salesmanID) = upper(?1))")
    List<Product> findAllBySalesmanID(String salesmanID);
}