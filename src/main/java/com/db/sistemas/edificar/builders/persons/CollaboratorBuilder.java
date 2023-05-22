package com.db.sistemas.edificar.builders.persons;

import com.db.sistemas.edificar.domains.PaymentFormatEnum;
import com.db.sistemas.edificar.domains.persons.entities.Collaborator;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CollaboratorBuilder {

  private String name;
  private String cpf;
  private String cnpj;
  private LocalDate birthday;
  private String cellphone;
  private Long addressId;
  private Long companyId;
  private PaymentFormatEnum payFormat;
  private BigDecimal payment;
  private Integer workTime;

  public CollaboratorBuilder setName(final String name) {
    this.name = name;
    return this;
  }

  public CollaboratorBuilder setCpf(final String cpf) {
    this.cpf = cpf;
    return this;
  }

  public CollaboratorBuilder setCnpj(final String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

  public CollaboratorBuilder setBirthday(final LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

  public CollaboratorBuilder setCellphone(final String cellphone) {
    this.cellphone = cellphone;
    return this;
  }

  public CollaboratorBuilder setAddressId(final Long addressId) {
    this.addressId = addressId;
    return this;
  }

  public CollaboratorBuilder setCompanyId(final Long companyId) {
    this.companyId = companyId;
    return this;
  }

  public CollaboratorBuilder setPaymentFormatEnum(final PaymentFormatEnum payFormat) {
    this.payFormat = payFormat;
    return this;
  }

  public CollaboratorBuilder setPayment(final BigDecimal payment) {
    this.payment = payment;
    return this;
  }

  public CollaboratorBuilder setWorkTime(final Integer workTime) {
    this.workTime = workTime;
    return this;
  }

  public Collaborator build() {
    return new Collaborator(
        name,
        cpf,
        cnpj,
        birthday,
        cellphone,
        addressId,
        companyId,
        payFormat,
        payment,
        workTime);
  }
}
