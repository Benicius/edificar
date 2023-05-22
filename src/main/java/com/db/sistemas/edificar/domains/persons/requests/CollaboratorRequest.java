package com.db.sistemas.edificar.domains.persons.requests;

import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.PaymentFormatEnum;
import com.db.sistemas.edificar.domains.persons.entities.Company;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDate;

public class CollaboratorRequest {

	private PaymentFormatEnum payFormat;
	private BigDecimal payment;
	private Integer workTime;

	private Long id;
	private String name;
	private String cpf;
	private String cnpj;
	private LocalDate birthday;
	private String cellphone;
	private Address address;
	private Company company;

	public PaymentFormatEnum getPayFormat() {
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
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

	@Override
	public String toString() {
		return "CollaboratorRequest{" +
						"payFormat=" + payFormat +
						", payment=" + payment +
						", workTime=" + workTime +
						", id=" + id +
						", name='" + name + '\'' +
						", cpf='" + cpf + '\'' +
						", cnpj='" + cnpj + '\'' +
						", birthday=" + birthday +
						", cellphone='" + cellphone + '\'' +
						", address=" + address +
						", company=" + company +
						'}';
	}
}
