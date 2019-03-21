package com.adrian.cinema.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Access(AccessType.FIELD)
@Table(name="room")
@EntityListeners(AuditingEntityListener.class)
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_room;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Place.class,  mappedBy = "place")
    private Place place;

    private Set<Place>places = new HashSet<Place>();
    private String name;

    public Set<Place> getPlaces() {
        return this.places;
    }

    public Long getId_room() {
        return id_room;
    }

    public void setId_room(Long id_room) {
        this.id_room = id_room;
    }
    public void setPlace(Place place){
        this.place=place;
    }

    public Place getPlace() {
        return place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}