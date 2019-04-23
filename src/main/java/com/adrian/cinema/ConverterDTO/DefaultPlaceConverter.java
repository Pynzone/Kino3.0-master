package com.adrian.cinema.ConverterDTO;

import com.adrian.cinema.model.Place;

public class DefaultPlaceConverter implements BaseConverter<Place, PlaceDTO> {

    @Override
    public PlaceDTO convert (Place form){
        PlaceDTO place = new PlaceDTO();
        place.setNumber(form.getNumber());
        place.setPlaceId(form.getPlaceId());
        place.setOccupited(form.getOccupited());
        place.setRow(form.getRow());
    }
}
