package com.prueba.digitalspace.infrastructure.adapter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "DeliveryPlan")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryPlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveryPlanId;
    @Column(name = "productQuantity")
    private Long productQuantity;
    @Column(name = "dateRegister")
    private LocalDateTime dateRegister;
    @Column(name = "dateDelivery")
    private LocalDateTime dateDelivery;
    @Column(name = "vehicleNumber")
    private String vehicleNumber;
    @Column(name = "guideNumber")
    private String guideNumber;
    @OneToOne
    @JoinColumn(name = "typeProductId", unique = true)
    private TypeProductsEntity typeProducts;
    @OneToOne
    @JoinColumn(name = "warehouseDeliveryId", unique = true)
    private WarehouseDeliveryEntity warehouseDelivery;
    @OneToOne
    @JoinColumn(name = "seaportId", unique = true)
    private SeaportsEntity seaports;
    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private CustomersEntity customers;
}