package com.iset.test.repository;

import com.iset.test.model.order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepo extends JpaRepository<order,Long> {
}
