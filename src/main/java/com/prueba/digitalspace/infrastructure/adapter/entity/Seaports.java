package com.prueba.digitalspace.infrastructure.adapter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Seaports")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Seaports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seaportsId;
    @Column(name = "seaports", unique = true, nullable = false)
    private String seaports;
    @OneToOne(mappedBy = "seaports", cascade = CascadeType.ALL)
    private DeliveryPlan deliveryPlan;
}
