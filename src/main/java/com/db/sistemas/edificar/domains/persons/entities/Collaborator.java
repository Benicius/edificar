package com.db.sistemas.edificar.domains.persons.entities;

import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.PaymentFormatEnum;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Collaborator extends Person {

  private PaymentFormatEnum payFormat;
  private BigDecimal payment;
  private Integer workTime;

}
