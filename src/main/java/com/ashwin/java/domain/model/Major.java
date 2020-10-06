package com.ashwin.java.domain.model;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Major {
    PHYSICS("physics"),
    CHEMISTRY("chemistry"),
    MATHEMATICS("maths"),

    //spring.jackson.deserialization.read-unknown-enum-values-using-default-value = true
    @JsonEnumDefaultValue
    UNKNOWN("unknown");

    private String value;

    Major(String value) {
        this.value = value;
    }

    /**
     * Major.value will be the JSON value for the enum, and NOT Major.toString()
     */
    @JsonValue
    public String getValue() {
        return this.value;
    }
}
