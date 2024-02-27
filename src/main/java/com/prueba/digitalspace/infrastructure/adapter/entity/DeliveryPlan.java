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
public class DeliveryPlan {
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
    private TypeProducts typeProducts;
    @OneToOne
    @JoinColumn(name = "warehouseDeliveryId", unique = true)
    private WarehouseDelivery warehouseDelivery;
    @OneToOne
    @JoinColumn(name = "seaportId", unique = true)
    private Seaports seaports;
    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customers customers;
}
