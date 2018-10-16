package com.example.postgresdemo.model;
import javax.persistence.*;

@Embeddable
public class Statistics {
    private Flights flights;

    @Transient
    private ofDelays nofDelays;

    @Transient
    private MinutesDelayed minutesDelayed;

    public Flights getFlights() {
        return flights;
    }

    public void setFlights(Flights flights) {
        this.flights = flights;
    }

    public ofDelays getNofDelays() {
        return nofDelays;
    }

    public void setNofDelays(ofDelays nofDelays) {
        this.nofDelays = nofDelays;
    }

    public MinutesDelayed getMinutesDelayed() {
        return minutesDelayed;
    }

    public void setMinutesDelayed(MinutesDelayed minutesDelayed) {
        this.minutesDelayed = minutesDelayed;
    }
}
