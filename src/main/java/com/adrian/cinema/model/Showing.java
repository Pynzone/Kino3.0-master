package com.adrian.cinema.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Access(AccessType.FIELD)
@Table(name="showing")
@EntityListeners(AuditingEntityListener.class)
public class Showing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_showing")
    private Long id_showing;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @NotBlank
    private Float price;

    private Long movie_id;
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "room_id",referencedColumnName = "id_room")
    private Room room;


    public Long getId_showing(){
        return id_showing;
    }
    public void setId_showing(Long id_showing){
        this.id_showing=id_showing;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Long movie_id) {
        this.movie_id = movie_id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}

