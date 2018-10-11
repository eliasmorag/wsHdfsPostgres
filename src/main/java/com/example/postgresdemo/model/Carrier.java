package com.example.postgresdemo.model;
import javax.persistence.*;

@Embeddable
public class Carrier {

    @Column(name = "carrier_code")
    private String code;
    @Column(name = "carrier_name")
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
