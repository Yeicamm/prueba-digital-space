package com.prueba.digitalspace.infrastructure.adapter.repository;

import com.prueba.digitalspace.infrastructure.adapter.entity.DeliveryPlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryPlanRepository extends JpaRepository<DeliveryPlanEntity,Long> {
}
