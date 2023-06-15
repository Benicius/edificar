package com.db.sistemas.edificar.repository.structure;

import com.db.sistemas.edificar.domains.structure.entities.Execution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutionRepository extends JpaRepository<Execution, Long> {
}
