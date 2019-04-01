package com.adrian.cinema.Service;

import com.adrian.cinema.exception.ResourceNotFoundException;
import com.adrian.cinema.model.Place;
import com.adrian.cinema.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {
    @Autowired
    PlaceRepository placeRepository;


    public List<Place> getAllPlace() {
        return placeRepository.findAll();
    }

    public Place createPlace(Place place) {
        return placeRepository.save(place);
    }


    public Place getPlaceById(Long placeId) {
        return placeRepository.findById(placeId)
                .orElseThrow(() -> new ResourceNotFoundException("Place", "id_place", placeId));
    }


    public Place updatePlace(Long placeId, Place placeDetails) {
        Place place = placeRepository.findById(placeId).
                orElseThrow(() -> new ResourceNotFoundException("Place", "id_place", placeId));
        place.setNumber(placeDetails.getNumber());
        place.setRow(placeDetails.getRow());
        place.setOccupited(placeDetails.getOccupited());
        place.setRoom(placeDetails.getRoom());
        place.setReservation_id(placeDetails.getReservation_id());


        Place updatedPlace = placeRepository.save(place);
        return updatedPlace;


    }

    public ResponseEntity<?> deletePlace(Long placeId) {
        Place place = placeRepository.findById(placeId)
                .orElseThrow(() -> new ResourceNotFoundException("Place", "id_place", placeId));

        placeRepository.delete(place);

        return ResponseEntity.ok().build();
    }
}
