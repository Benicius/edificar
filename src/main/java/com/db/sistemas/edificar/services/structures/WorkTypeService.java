package com.db.sistemas.edificar.services.structures;

import com.db.sistemas.edificar.domains.structure.entities.WorkType;
import com.db.sistemas.edificar.domains.structure.requests.WorkTypeRequest;
import com.db.sistemas.edificar.repository.structure.WorkTypeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkTypeService {

	private final WorkTypeRepository workTypeRepository;

	@Autowired
	public WorkTypeService(WorkTypeRepository workTypeRepository) {
		this.workTypeRepository = workTypeRepository;
	}

	public WorkType saveWork(final WorkTypeRequest workTypeRequest){
		var workType = new WorkType();
		BeanUtils.copyProperties(workType, workTypeRequest);
		return workTypeRepository.save(workType);
	}

	public List<WorkType> getWorks(){
		return workTypeRepository.findAll();
	}
}
