package com.adrian.cinema.ConverterDTO;

import java.util.Date;

public class MovieDTO {

    private Long movieId;
    private Date premiere;
    private String type;
    private String name;
    private String ageCategory;
    private Long duration;
    private String direction;
    private String cast;
    private String scenario;
    private String dyscryption;
    private  String imgURL;

    //private Set<Showing> showings = new HashSet<Showing>();



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

   // public Set<Showing> getShowings() {
   //     return showings;
   // }
   // public void setShowings(Set<Showing> showings){
   //     this.showings=showings;
   // }
    public String getName(){
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getImgURL(){
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}