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
    @Column(name = "id_reservation")
    private Long reservationId;
    @Column(name ="id_user")
    private  Long idUser;
    @Column(name = "id_showing")
    private  Long idShowing;

    public Long getIdReservation() {
        return reservationId;
    }

    public void setId_reservation(Long reservationId) {
        this.reservationId = reservationId;
    }
    public Long getUsserId(){
        return idUser;
    }

    public void setUsserId(Long idUser) {
        this.idUser = idUser;
    }
    public Long getShowingId(){
        return idShowing;
    }

    public void setShowingId(Long idShowing) {
        this.idShowing = idShowing;
    }
}
