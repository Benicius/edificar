package com.db.sistemas.edificar.services.persons;

import com.db.sistemas.edificar.domains.persons.entities.Collaborator;
import com.db.sistemas.edificar.repository.persons.CollaboratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollaboratorService {

	private final CollaboratorRepository collaboratorRepository;

	@Autowired
	public CollaboratorService(CollaboratorRepository collaboratorRepository) {
		this.collaboratorRepository = collaboratorRepository;
	}

	public Collaborator saveCollaborator(final Collaborator collaborator){
		return collaboratorRepository.save(collaborator);
	}

	public List<Collaborator> getCollaborators() {
		return collaboratorRepository.findAll();
	}
}
