package com.prueba.digitalspace.infrastructure.adapter.repository;

import com.prueba.digitalspace.infrastructure.adapter.entity.SeaportsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeaportRepository extends JpaRepository<SeaportsEntity, Long> {
}
