package com.db.sistemas.edificar.domains.structure.entities;

import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.persons.entities.Company;
import jakarta.persistence.*;

import java.math.BigDecimal;

@MappedSuperclass
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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }
}
