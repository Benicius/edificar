package com.db.sistemas.edificar.domains.structure.entities;

import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.persons.entities.Company;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class Structure {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String description;
  private BigDecimal price;

  @OneToOne
  @JoinColumn(name = "address_id", nullable = false)
  private Address address;

  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "company_id", nullable = false)
  private Company company;
}
