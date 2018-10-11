package com.example.postgresdemo.model;
import javax.persistence.*;

@Embeddable
public class ofDelays {
    private int lateAircraft;
    private int weather;
    private int security;
    private int nationalAviatinonSystem;
    private int carrier;


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

    public int getSecurity() {
        return security;
    }

    public void setSecurity(int security) {
        this.security = security;
    }

    public int getNationalAviatinonSystem() {
        return nationalAviatinonSystem;
    }

    public void setNationalAviatinonSystem(int nationalAviatinonSystem) {
        this.nationalAviatinonSystem = nationalAviatinonSystem;
    }

    public int getCarrier() {
        return carrier;
    }

    public void setCarrier(int carrier) {
        this.carrier = carrier;
    }
}
