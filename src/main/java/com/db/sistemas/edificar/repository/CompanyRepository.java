package com.db.sistemas.edificar.repository;

import com.db.sistemas.edificar.domains.persons.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
