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
    private String dateDelivery;
    @Column(name = "vehicleNumber")
    private String vehicleNumber;
    @Column(name = "guideNumber")
    private String guideNumber;
    @Column(name = "price")
    private Double price;
    @Column(name = "priceDiscount")
    private Double priceDiscount;
    @OneToOne
    @JoinColumn(name = "typeProductId")
    private TypeProductsEntity typeProducts;
    @OneToOne
    @JoinColumn(name = "warehouseDeliveryId")
    private WarehouseEntity warehouseDelivery;
    @OneToOne
    @JoinColumn(name = "seaportId")
    private SeaportsEntity seaports;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private CustomersEntity customers;
}
