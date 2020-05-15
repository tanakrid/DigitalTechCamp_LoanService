package com.digitalacademy.loan.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class StatusModel implements Serializable {
    @JsonProperty
    private String code;

    @JsonProperty
    private String message;

    public StatusModel(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public StatusModel(){

    }
}
