package com.prueba.digitalspace.infrastructure.adapter.repository;

import com.prueba.digitalspace.infrastructure.adapter.entity.DeliveryPlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryPlanRepository extends JpaRepository<DeliveryPlanEntity,Long> {
    List<DeliveryPlanEntity> findByGuideNumber(String guideNumber);
}
