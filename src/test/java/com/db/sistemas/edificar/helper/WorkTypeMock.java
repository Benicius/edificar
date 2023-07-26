package com.db.sistemas.edificar.helper;

import com.db.sistemas.edificar.domains.structure.entities.WorkType;

import java.math.BigDecimal;

public class WorkTypeMock {

	public WorkTypeMock() {}

	public static WorkType getWorkType(){
		var workType = new WorkType();
		workType.setName("Fundação");
		workType.setDescription("Vamos Criar a Fundação");
		workType.setPrice(BigDecimal.valueOf(15.751));
		return workType;
	}
}
