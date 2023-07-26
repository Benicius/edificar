package com.db.sistemas.edificar.repository;

import com.db.sistemas.edificar.domains.structure.entities.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<Work, Long> {
}
