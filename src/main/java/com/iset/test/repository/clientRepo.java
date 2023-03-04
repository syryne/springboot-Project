package com.iset.test.repository;

import com.iset.test.model.client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepo extends JpaRepository <client,Long> {
}
