package com.adrian.cinema.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "id_room")
    private Long roomId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Place.class,  mappedBy = "room")
    private Set<Place>places = new HashSet<Place>();


   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Showing.class,  mappedBy = "room")
   @JsonIgnore
   private Set<Showing>showings = new HashSet<Showing>();
    @Column(name = "name")
    private String name;

    public Long getId_room() {
        return roomId;
    }

    public void setId_room(Long roomId) {
        this.roomId = roomId;
    }

    public Set<Showing> getShowings() {
        return showings;
    }
    public void setShowings(Set<Showing> showings){
        this.showings=showings;
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}