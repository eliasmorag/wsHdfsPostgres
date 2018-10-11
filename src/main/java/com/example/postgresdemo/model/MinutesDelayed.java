package com.example.postgresdemo.model;
import javax.persistence.*;

@Embeddable
public class MinutesDelayed {
    @Column(name = "md_lateaircraft")
    private int lateAircraft;
    @Column(name = "md_weather")
    private int weather;
    @Column(name = "md_carrier")
    private int carrier;
    @Column(name = "md_security")
    private int security;
    @Column(name = "md_total")
    private int total;
    @Column(name = "md_nationalavsystem")
    private int nationalAviatinonSystem;

    public int getLateAircraft() {
        return lateAircraft;
    }

    public void setLateAircraft(int lateAircraft) {
        this.lateAircraft = lateAircraft;
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    public int getCarrier() {
        return carrier;
    }

    public void setCarrier(int carrier) {
        this.carrier = carrier;
    }

    public int getSecurity() {
        return security;
    }

    public void setSecurity(int security) {
        this.security = security;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNationalAviatinonSystem() {
        return nationalAviatinonSystem;
    }

    public void setNationalAviatinonSystem(int nationalAviatinonSystem) {
        this.nationalAviatinonSystem = nationalAviatinonSystem;
    }
}
