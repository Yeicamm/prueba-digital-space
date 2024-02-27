package com.prueba.digitalspace.infrastructure.adapter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TypeProducts")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TypeProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeProductId;
    @Column(name = "descripProduct")
    private String descriptionProduct;
    @Column(name = "typeProduct")
    private String typeProduct;
    @OneToOne(mappedBy = "typeProducts", cascade = CascadeType.ALL)
    private DeliveryPlan deliveryPlan;
}
