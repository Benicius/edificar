package com.db.sistemas.edificar.domains.persons.entities;

import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.PaymentFormatEnum;
import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Collaborator extends Person {

  private PaymentFormatEnum payFormat;
  private BigDecimal payment;
  private Integer workTime;

  public Collaborator(
      String name,
      String cpf,
      String cnpj,
      LocalDate birthday,
      String cellphone,
      Address addressId,
      Company companyId,
      PaymentFormatEnum payFormat,
      BigDecimal payment,
      Integer workTime) {
    super(name, cpf, cnpj, birthday, cellphone, addressId, companyId);
    this.payFormat = payFormat;
    this.payment = payment;
    this.workTime = workTime;
  }

  public Collaborator() {
  }

  public PaymentFormatEnum isPayFormat() {
    return payFormat;
  }

  public void setPayFormat(PaymentFormatEnum payFormat) {
    this.payFormat = payFormat;
  }

  public BigDecimal getPayment() {
    return payment;
  }

  public void setPayment(BigDecimal payment) {
    this.payment = payment;
  }

  public Integer getWorkTime() {
    return workTime;
  }

  public void setWorkTime(Integer workTime) {
    this.workTime = workTime;
  }
}
