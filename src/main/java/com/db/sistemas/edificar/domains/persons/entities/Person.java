package com.db.sistemas.edificar.domains.persons.entities;

import com.db.sistemas.edificar.domains.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  private String cpf;
  private String cnpj;
  private LocalDate birthday;
  private String cellphone;
  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "address_id", nullable = false)
  private Address address;

  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "company_id", nullable = false)
  private Company company;


}
