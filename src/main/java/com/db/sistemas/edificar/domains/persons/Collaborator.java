package com.db.sistemas.edificar.domains.persons;

import com.db.sistemas.edificar.domains.PaymentFormatEnum;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Collaborator extends Person {

  private PaymentFormatEnum payFormat;
  private BigDecimal payment;
  private Integer workTime;

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
