package com.prueba.digitalspace.infrastructure.adapter.entity;

import com.prueba.digitalspace.domain.model.enums.SiteEnum;
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
public class SeaportsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seaportsId;
    @Column(name = "seaports", unique = true, nullable = false)
    private String seaports;
    @Enumerated(EnumType.STRING)
    @Column(name = "site")
    private SiteEnum siteEnum;
    @OneToOne(mappedBy = "seaports", cascade = CascadeType.ALL)
    private DeliveryPlanEntity deliveryPlan;
}
