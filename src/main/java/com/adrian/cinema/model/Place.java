package com.adrian.cinema.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name="place")
@EntityListeners(AuditingEntityListener.class)
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_place")
    private Long placeId;
    //@ManyToOne(fetch = FetchType.LAZY)//fetchType.Lazy to leniwe ładwanie danych,
    // nie będą od razu doczytane, tylko na bieżąco w ramach działania aplikacji i w razie potrzeby
    @ManyToOne()
    @JoinColumn(name = "id_room", nullable = false)
    @JsonIgnore
    private Room room;
    @Column(name = "number")
    private Long number;
    @Column(name = "row")
    private Long row;
    @Column(name = "occupited")
    private Boolean occupited;
    @Column(name = "id_reservation")
    private Long reservationId;

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Boolean getOccupited() {
        return occupited;
    }

    public void setOccupited(Boolean occupited) {
        this.occupited = occupited;
    }

    public Long getReservation_id() {
        return reservationId;
    }

    public void setReservation_id(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getRow() {
        return row;
    }

    public void setRow(Long row) {
        this.row = row;
    }
}
