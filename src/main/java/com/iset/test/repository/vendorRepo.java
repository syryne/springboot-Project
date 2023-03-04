package com.iset.test.repository;

import com.iset.test.model.vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vendorRepo extends JpaRepository<vendor,Long> {
}
