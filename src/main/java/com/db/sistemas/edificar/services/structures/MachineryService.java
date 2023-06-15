package com.db.sistemas.edificar.services.structures;

import com.db.sistemas.edificar.domains.structure.entities.Machinery;
import com.db.sistemas.edificar.domains.structure.requests.MachineryRequests;
import com.db.sistemas.edificar.repository.structure.MachineryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MachineryService {

	private final MachineryRepository machineryRepository;

	@Autowired
	public MachineryService(MachineryRepository machineryRepository) {
		this.machineryRepository = machineryRepository;
	}

	public Machinery saveMachinery(final MachineryRequests machineryRequests){
		var machinery = new Machinery();
		BeanUtils.copyProperties(machinery, machineryRequests);
		return machineryRepository.save(machinery);
	}

	public List<Machinery> getMachines(){
		return machineryRepository.findAll();
	}
}
