package com.adrian.cinema.ConverterDTO;

public class PlaceDTO {

    private Long placeId;
   // private Room room;
    private Long number;
    private Long row;
    private Boolean occupited;
    private Long reservationId;
    /*
    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
*/
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
