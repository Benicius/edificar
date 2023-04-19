package com.db.sistemas.edificar.domains.structure;

public enum LeaseType {

    HOURS("HOURS"),
    DAY("DAY"),
    MOUTH("MOUTH");

    private String description;

    private LeaseType(String desc){
        this.description = desc;
    }

    public String getDescription() {
        return this.description;
    }
}
