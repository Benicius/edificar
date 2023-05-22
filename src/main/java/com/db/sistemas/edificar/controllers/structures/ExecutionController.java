package com.db.sistemas.edificar.controllers.structures;

import com.db.sistemas.edificar.domains.structure.Execution;
import com.db.sistemas.edificar.services.structures.ExecutionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/executions")
public class ExecutionController {

	private final ExecutionService executionService;

	public ExecutionController(ExecutionService executionService) {
		this.executionService = executionService;
	}

	@PostMapping
	public ResponseEntity<Execution> saveExecution(@RequestBody final Execution execution){
		return new ResponseEntity<>(executionService.saveExecution(execution), HttpStatus.CREATED);
	}
}
