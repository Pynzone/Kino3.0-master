package com.adrian.cinema.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name="reservation")
@EntityListeners(AuditingEntityListener.class)
public class Reservation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reservation;
    private  Long usser_id;
    private  Long showing_id;

    public Long getIdReservation() {
        return id_reservation;
    }

    public void setId_reservation(Long id_reservation) {
        this.id_reservation = id_reservation;
    }
    public Long getUsserId(){
        return usser_id;
    }

    public void setUsserId(Long usser_id) {
        this.usser_id = usser_id;
    }
    public Long getShowingId(){
        return showing_id;
    }

    public void setShowingId(Long showing_id) {
        this.showing_id = showing_id;
    }
}
