package com.db.sistemas.edificar.repository.structure;

import com.db.sistemas.edificar.domains.structure.Machinery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineryRepository extends JpaRepository<Machinery, Long> {
}
