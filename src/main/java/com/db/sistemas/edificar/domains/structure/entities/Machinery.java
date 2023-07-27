package com.db.sistemas.edificar.domains.structure.entities;

import com.db.sistemas.edificar.domains.structure.PaymentFormatEnum;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Machinery extends Structure{

    private PaymentFormatEnum paymentFormat;
    private String power;
    private LocalDate leaseDate;

}
