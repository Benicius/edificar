package com.db.sistemas.edificar.services;

import com.db.sistemas.edificar.repository.WorkRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkService {

	private final WorkRepository workRepository;

	public WorkService(WorkRepository workRepository) {
		this.workRepository = workRepository;
	}


}
