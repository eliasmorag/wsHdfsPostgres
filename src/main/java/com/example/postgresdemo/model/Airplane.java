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

    @Transient
    private Airport airport;

    private Statistics statistics;

    @Transient
    private Atime time;

    private Carrier carrier;

    @Column(name = "borrar", nullable = false, columnDefinition = "int default 0")
    private int borrar;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public Atime getTime() {
        return time;
    }

    public void setTime(Atime time) {
        this.time = time;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public int getBorrar() { return borrar; }

    public void setBorrar(int borrar) { this.borrar = borrar; }
}