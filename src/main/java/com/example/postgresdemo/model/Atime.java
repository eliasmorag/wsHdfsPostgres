package com.example.postgresdemo.model;

import javax.persistence.*;

@Embeddable
public class Atime {
    private String label;
    private int year;
    private int month;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
