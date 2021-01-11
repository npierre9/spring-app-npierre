package com.emse.spring.faircorp.model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="ROOM")
public class Room {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private int floor;

    @Column(nullable=false)
    private String name;

    @Column(nullable=true)
    private Double currentTemperature;

    @Column(nullable=true)
    private Double targetTemperature;

    @OneToMany(mappedBy = "room")
    private Set<Heater> heaters;

    @OneToMany(mappedBy = "room")
    private Set<Window> windows;

    public Room() {
    }

    public Room(String name, int floor) {
        this.floor = floor;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(Double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(Double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public Set<Heater> getHeaterList() {
        return heaters;
    }

    public void setHeaterList(Set<Heater> heaters) {
        this.heaters = heaters;
    }

    public Set<Window> getWindowList() {
        return windows;
    }

    public void setWindowList(Set<Window> windows) {
        this.windows = windows;
    }
}


