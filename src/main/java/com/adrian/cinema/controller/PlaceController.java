package com.adrian.cinema.controller;

import com.adrian.cinema.Service.PlaceService;
import com.adrian.cinema.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PlaceController {
    private final PlaceService placeService;

    @Autowired
    public PlaceController(PlaceService placeService)
    {
        this.placeService = placeService;
    }

    @GetMapping("/place")
    public List<Place>getAllPlace(){
        return placeService.getAllPlace();
    }

    @PostMapping("/place")
    public Place createPlace(@RequestBody Place place){
        return placeService.createPlace(place);
    }
    @GetMapping("/place/{id_place}")
    public Place getPlaceById(@PathVariable(value = "id_place")Long placeId){
        return placeService.getPlaceById(placeId);
    }


    @PutMapping("/place/{id_place}")
    public Place updatePlace(@PathVariable(value = "id_place")Long placeId,@Valid @RequestBody Place placeDetails){
        return placeService.updatePlace(placeId,placeDetails);
    }

    @DeleteMapping("/place/{id_place}")
    public ResponseEntity<?>deletePlace(@PathVariable(value = "id_place")Long placeId){
        return placeService.deletePlace(placeId);
    }

}

