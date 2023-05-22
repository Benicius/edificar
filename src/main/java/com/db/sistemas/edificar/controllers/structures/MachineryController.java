package com.db.sistemas.edificar.controllers.structures;

import com.db.sistemas.edificar.domains.structure.Machinery;
import com.db.sistemas.edificar.services.structures.MachineryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/machines")
public class MachineryController {

	private final MachineryService machineryService;

	@Autowired
	public MachineryController(MachineryService machineryService) {
		this.machineryService = machineryService;
	}

	@PostMapping
	public ResponseEntity<Machinery> saveMachinery(@RequestBody final Machinery machinery){
		return new ResponseEntity<>(machineryService.saveMachinery(machinery), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Machinery>> findAll(){
		return new ResponseEntity<>(machineryService.getMachines(), HttpStatus.OK);
	}
}
