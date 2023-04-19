package com.db.sistemas.edificar.domains.structure;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Machinery extends Structure{

    private LeaseType leaseType;
    private String power;
    private LocalDate leaseDate;

    public LeaseType getLeaseType() {
        return leaseType;
    }

    public void setLeaseType(LeaseType leaseType) {
        this.leaseType = leaseType;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public LocalDate getLeaseDate() {
        return leaseDate;
    }

    public void setLeaseDate(LocalDate leaseDate) {
        this.leaseDate = leaseDate;
    }
}
