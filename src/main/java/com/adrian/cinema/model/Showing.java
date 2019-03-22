package com.adrian.cinema.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Access(AccessType.FIELD)
@Table(name = "showing")
@EntityListeners(AuditingEntityListener.class)
public class Showing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_showing")
    private Long showingId;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private Float price;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id", referencedColumnName = "id_room")
    private Room room;

    @OneToOne()
    @JoinColumn(name = "movie_id", referencedColumnName = "id_movie")
    private Movie movie;

    public Long getShowingId() {
        return showingId;
    }

    public void setShowingId(Long showingId) {
        this.showingId = showingId;
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}

