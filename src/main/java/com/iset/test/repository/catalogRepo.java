package com.iset.test.repository;


import com.iset.test.model.catalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface catalogRepo  extends JpaRepository<catalog,Long> {
}
