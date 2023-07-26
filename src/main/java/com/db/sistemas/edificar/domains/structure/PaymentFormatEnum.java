package com.db.sistemas.edificar.domains.structure;

public enum PaymentFormatEnum {

    HOURS("HOURS"),
    DAY("DAY"),
    MOUTH("MOUTH");

    private String description;

    private PaymentFormatEnum(String desc){
        this.description = desc;
    }

    public String getDescription() {
        return this.description;
    }
}
