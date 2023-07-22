package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.Sale;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    @Query("select s from Sale s where s.salesmanID = ?1")
    List<Sale> findBySalesmanIDEquals(String salesmanID);
    @Query("select s from Sale s where upper(s.salesmanID) = upper(?1)")
    Sale findBySalesmanIDEqualsAllIgnoreCase(@NonNull String salesmanID);
}