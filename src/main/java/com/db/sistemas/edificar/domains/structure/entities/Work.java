package com.db.sistemas.edificar.domains.structure.entities;

import com.db.sistemas.edificar.domains.persons.entities.Collaborator;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "work")
public class Work {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	private Set<WorkType> workTypes;
	private Set<Machinery> machines;
	private Set<Execution> executions;
	private Set<Collaborator> collaborators;

	private LocalDate startDate;
	private LocalDate updateDate;
	private LocalDate endDate;
	private LocalDate expectedDate;

	private BigDecimal workPrice;

}
