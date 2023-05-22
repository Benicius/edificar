package com.db.sistemas.edificar.controllers.persons;

import com.db.sistemas.edificar.domains.persons.entities.Collaborator;
import com.db.sistemas.edificar.services.persons.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/collaborators")
public class CollaboratorController {

	private final CollaboratorService collaboratorService;

	@Autowired
	public CollaboratorController(CollaboratorService collaboratorService) {
		this.collaboratorService = collaboratorService;
	}

	@PostMapping
	public ResponseEntity<Collaborator> saveCollaborator(@RequestBody final Collaborator collaborator){
		return new ResponseEntity<>(collaboratorService.saveCollaborator(collaborator), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Collaborator>> getCollaborators(){
		return new ResponseEntity<>(collaboratorService.getCollaborators(), HttpStatus.OK);
	}
}
