package com.db.sistemas.edificar.domains.structure.entities;

public enum ExecutionType {

    INTERNAL("INTERNAL"),
    EXTERNAL("EXTERNAL");

    private String description;

    private ExecutionType(String desc){
        this.description = desc;
    }

    public String getDescription() {
        return this.description;
    }
}
