package com.iset.test.repository;

import com.iset.test.model.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepo extends JpaRepository<product,Long> {
}
