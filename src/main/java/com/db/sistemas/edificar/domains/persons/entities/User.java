package com.db.sistemas.edificar.domains.persons.entities;

import com.db.sistemas.edificar.domains.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_user")
public class User extends Person {

  private String username;
  private String password;

  @Builder
  public User(
      Long id,
      String name,
      String cpf,
      String cnpj,
      LocalDate birthday,
      String cellphone,
      Address address,
      Company company,
      String username,
      String password) {
    super(id, name, cpf, cnpj, birthday, cellphone, address, company);
    this.username = username;
    this.password = password;
  }

}
