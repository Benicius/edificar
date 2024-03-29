package com.db.sistemas.edificar.controllers.structures;

import com.db.sistemas.edificar.domains.structure.entities.WorkType;
import com.db.sistemas.edificar.domains.structure.requests.WorkTypeRequest;
import com.db.sistemas.edificar.services.structures.WorkTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/works")
public class WorkController {

	private final WorkTypeService workService;

	@Autowired
	public WorkController(WorkTypeService workService) {
		this.workService = workService;
	}

	@PostMapping
	public ResponseEntity<WorkType> saveWorkType(@RequestBody final WorkTypeRequest workTypeRequest){
		return new ResponseEntity<>(workService.saveWork(workTypeRequest), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<WorkType>> getWorkType(){
		return new ResponseEntity<>(workService.getWorks(), HttpStatus.OK);
	}
}
