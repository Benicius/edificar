package com.db.sistemas.edificar.repository.persons;

import com.db.sistemas.edificar.domains.persons.entities.UserManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserManager, Long> {

	Optional<UserManager> findByUsername(String name);
}
