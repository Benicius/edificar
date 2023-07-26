package com.db.sistemas.edificar.domains.persons.entities;

import com.db.sistemas.edificar.domains.structure.PaymentFormatEnum;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Collaborator extends Person {

  private PaymentFormatEnum payFormat;
  private BigDecimal payment;
  private Integer workTime;

}
