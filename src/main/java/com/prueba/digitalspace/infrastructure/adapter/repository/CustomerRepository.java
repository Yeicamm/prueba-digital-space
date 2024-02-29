package com.prueba.digitalspace.infrastructure.adapter.repository;

import com.prueba.digitalspace.infrastructure.adapter.entity.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomersEntity, Long> {
}
