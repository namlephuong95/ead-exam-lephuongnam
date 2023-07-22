package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

public interface TestRepository extends JpaRepository<Test, Long> {
    @Query("select (count(t) > 0) from Test t where t.content = ?1 and t.id = ?2")
    boolean existsByContentEqualsAndId(@NonNull String content, @NonNull long id);
}