package com.prueba.digitalspace.infrastructure.adapter.entity;

import com.prueba.digitalspace.domain.model.enums.IdentificationTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Customer")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @Column(name = "name")
    private String customerName;
    @Column(name = "email")
    private String customerEmail;
    @Column(name = "address")
    private String address;
    @Enumerated(EnumType.STRING)
    @Column(name = "identificationType")
    private IdentificationTypeEnum identificationTypeEnum;
    @Column(name = "identificationNumber", unique = true, nullable = false)
    private String identificationNumber;
    @OneToMany(mappedBy = "customers", cascade = CascadeType.ALL)
    private List<DeliveryPlanEntity> deliveryPlans;
}
