package com.example.postgresdemo.model;

import javax.persistence.*;

@Entity
@Table(name = "airplanes")
public class Airplane {
    @Id
    @GeneratedValue(generator = "airplane_generator")
    @SequenceGenerator(
            name = "airplane_generator",
            sequenceName = "airplane_sequence",
            initialValue = 1
    )
    private Long id;

    private String airport;
    private String statistics;
    private String time;
    private String carrier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
}