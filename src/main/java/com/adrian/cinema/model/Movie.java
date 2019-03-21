package com.adrian.cinema.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Access(AccessType.FIELD)
@Table(name="movie")
@EntityListeners(AuditingEntityListener.class)
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_movie;
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date premiere;
    private String type;
    private String age_category;
    private Long duration;
    private String direction;
    private String cast;
    private String scenario;
    private String dyscryption;
    private Long showing_id;

    public Long getId_movie(){
        return id_movie;
    }

    public void setId_movie(Long id_movie) {
        this.id_movie = id_movie;
    }
    public Date getPremiere(){
        return premiere;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge_category() {
        return age_category;
    }

    public void setAge_category(String age_category) {
        this.age_category = age_category;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public void setPremiere(Date premiere) {
        this.premiere = premiere;
    }

    public Long getShowing_id() {
        return showing_id;
    }

    public void setShowing_id(Long showing_id) {
        this.showing_id = showing_id;
    }

    public String getDyscryption() {
        return dyscryption;
    }

    public void setDyscryption(String dyscryption) {
        this.dyscryption = dyscryption;
    }
}
