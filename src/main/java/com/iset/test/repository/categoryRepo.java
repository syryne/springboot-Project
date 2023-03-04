package com.iset.test.repository;

import com.iset.test.model.category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoryRepo extends JpaRepository<category,Long> {
}
