package com.db.sistemas.edificar.services.structures;

import com.db.sistemas.edificar.domains.structure.WorkType;
import com.db.sistemas.edificar.repository.structure.WorkTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkService {

	private final WorkTypeRepository workTypeRepository;

	@Autowired
	public WorkService(WorkTypeRepository workTypeRepository) {
		this.workTypeRepository = workTypeRepository;
	}

	public WorkType saveWork(final WorkType workType){
		return workTypeRepository.save(workType);
	}

	public List<WorkType> getWorks(){
		return workTypeRepository.findAll();
	}
}
