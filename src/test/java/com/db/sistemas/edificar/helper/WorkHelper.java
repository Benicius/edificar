package com.db.sistemas.edificar.helper;

import com.db.sistemas.edificar.domains.structure.entities.Work;
import com.db.sistemas.edificar.domains.structure.entities.WorkType;

import java.util.HashSet;
import java.util.Set;

public class WorkHelper {
	public WorkHelper() {
	}

	public static Work getWork(){
		var work = new Work();
		work.setWorkTypes(getSetWorkType());
		return work;
	}

	public static Set<WorkType> getSetWorkType(){
		Set<WorkType> workTypes = new HashSet<>();
		workTypes.add(WorkTypeMock.getWorkType());
		return workTypes;
	}
}
