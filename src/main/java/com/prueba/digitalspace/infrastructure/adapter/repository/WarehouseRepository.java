package com.prueba.digitalspace.infrastructure.adapter.repository;

import com.prueba.digitalspace.infrastructure.adapter.entity.WarehouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository<WarehouseEntity,Long> {
}
