package com.ashwin.java.domain.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Minor {
    POLITICAL_SCIENCE("politics"),
    COMPUTER_SCIENCE("computer"),
    MEDICAL_SCIENCE("medicene"),
    UNKNOWN("unknown");

    private String value;

    Minor(String value) {
        this.value = value;
    }

    @JsonCreator
    public static Minor fromValue(String value) {
        for (Minor minor : Minor.values()) {
            if (minor.value.equals(value)) {
                return minor;
            }
        }
        return Minor.UNKNOWN;
    }
}
