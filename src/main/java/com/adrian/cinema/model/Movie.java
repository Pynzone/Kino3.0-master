package com.adrian.cinema.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Access(AccessType.FIELD)
@Table(name="movie")
@EntityListeners(AuditingEntityListener.class)
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie")
    private Long movieId;

    @Column(name = "premiere")
    @Temporal(TemporalType.TIMESTAMP)
    private Date premiere;
    @Column(name = "type")
    private String type;
    @Column(name = "ageCategory")
    private String ageCategory;
    @Column(name = "duration")
    private Long duration;
    @Column(name = "direction")
    private String direction;
    @Column(name = "cast")
    private String cast;
    @Column(name = "scenario")
    private String scenario;
    @Column(name = "dyscryption")
    private String dyscryption;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Showing.class,  mappedBy = "movie")
    @JsonIgnore
    private Set<Showing> showings = new HashSet<Showing>();



    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
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

    public String getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
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

    public String getDyscryption() {
        return dyscryption;
    }

    public void setDyscryption(String dyscryption) {
        this.dyscryption = dyscryption;
    }

    public Set<Showing> getShowings() {
        return showings;
    }
    public void setShowings(Set<Showing> showings){
        this.showings=showings;
    }


}
