package com.db.sistemas.edificar.repository.persons;

import com.db.sistemas.edificar.domains.persons.entities.Collaborator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaboratorRepository extends JpaRepository<Collaborator, Long> {
}
