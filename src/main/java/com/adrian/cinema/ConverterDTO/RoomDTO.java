package com.adrian.cinema.ConverterDTO;

public class RoomDTO {
    private Long roomId;
   // private Set<Place>places = new HashSet<Place>();
   // private Set<Showing>showings = new HashSet<Showing>();
    private String name;

    public Long getId_room() {
        return roomId;
    }

    public void setId_room(Long roomId) {
        this.roomId = roomId;
    }
/*
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
*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
