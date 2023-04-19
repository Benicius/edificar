package com.db.sistemas.edificar.repository;

import com.db.sistemas.edificar.domains.persons.UserManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserManager, Long> {

}
