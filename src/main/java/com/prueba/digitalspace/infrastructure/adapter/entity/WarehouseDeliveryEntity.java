package com.prueba.digitalspace.infrastructure.adapter.entity;

import com.prueba.digitalspace.domain.model.enums.SiteEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "WarehouseDelivery")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class WarehouseDeliveryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long warehouseDeliveryId;
    @Column(name = "warehouseDelivery",unique = true)
    private String warehouseDelivery;
    @Enumerated(EnumType.STRING)
    @Column(name = "site")
    private SiteEnum siteEnum;
    @OneToOne(mappedBy = "warehouseDelivery", cascade = CascadeType.ALL)
    private DeliveryPlanEntity deliveryPlan;
}
