package com.db.sistemas.edificar.services.structures;

import com.db.sistemas.edificar.domains.structure.entities.Execution;
import com.db.sistemas.edificar.domains.structure.requests.ExecutionRequest;
import com.db.sistemas.edificar.repository.structure.ExecutionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutionService {

	private final ExecutionRepository executionRepository;

	public ExecutionService(ExecutionRepository executionRepository) {
		this.executionRepository = executionRepository;
	}

	public Execution saveExecution(final ExecutionRequest executionRequest){
		var execution = new Execution();
		BeanUtils.copyProperties(execution, executionRequest);
		return executionRepository.save(execution);
	}

	public List<Execution> findAll(){
		return executionRepository.findAll();
	}

	public Execution findById(final Long id){
		return executionRepository.findById(id).orElseThrow();
	}

	public Execution update(final Execution execution){
		return executionRepository.save(execution);
	}
}
