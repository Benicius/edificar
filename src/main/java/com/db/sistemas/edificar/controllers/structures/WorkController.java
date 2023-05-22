package com.db.sistemas.edificar.controllers.structures;

import com.db.sistemas.edificar.domains.structure.WorkType;
import com.db.sistemas.edificar.repository.structure.WorkTypeRepository;
import com.db.sistemas.edificar.services.structures.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/works")
public class WorkController {

	private final WorkService workService;

	@Autowired
	public WorkController(WorkService workService) {
		this.workService = workService;
	}

	@PostMapping
	public ResponseEntity<WorkType> saveWorkType(@RequestBody final WorkType workType){
		return new ResponseEntity<>(workService.saveWork(workType), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<WorkType>> getWorkType(){
		return new ResponseEntity<>(workService.getWorks(), HttpStatus.OK);
	}
}
