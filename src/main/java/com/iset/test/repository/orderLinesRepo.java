package com.iset.test.repository;

import com.iset.test.model.orderLines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderLinesRepo extends JpaRepository<orderLines,Long> {
}
