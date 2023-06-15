package com.db.sistemas.edificar.domains.structure.entities;

import jakarta.persistence.Entity;

@Entity
public class Execution extends Structure{

    private ExecutionType executionType;

    public ExecutionType getExecutionType() {
        return executionType;
    }

    public void setExecutionType(ExecutionType executionType) {
        this.executionType = executionType;
    }
}
