package com.adrian.cinema.controller;

import com.adrian.cinema.Service.ReservationService;
import com.adrian.cinema.exception.ResourceNotFoundException;
import com.adrian.cinema.model.Reservation;
import com.adrian.cinema.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/api")
public class ReservationController {
    private final ReservationService reservationService;
    @Autowired
    ReservationController(ReservationService reservationService){
        this.reservationService=reservationService;
    }

    @GetMapping("/reservation")
    public List<Reservation>getAllReservation(){
        return reservationService.getAllReservation();
    }
    @PostMapping("/reservation")
    public Reservation createReservation(@Valid @RequestBody Reservation reservation){
        return reservationService.createReservation(reservation);
    }

    @GetMapping("/reservation/{id_reservation}")
    public Reservation getReservationById(@PathVariable(value = "id_reservation")Long reservationId){
        return reservationService.getReservationById(reservationId);
    }
    @PutMapping("/reservation/{id_reservation}")
    public Reservation updateReservation(@PathVariable(value = "id_reservation")Long reservationId,
                                         @Valid @RequestBody Reservation reservationDetails)
    {
        return reservationService.updateReservation(reservationId,reservationDetails);
    }
    @DeleteMapping("/reservation/{id_reservation}")
    public ResponseEntity<?>deleteReservation(@PathVariable(value = "id_reservation")Long reservationId)
    {
        return reservationService.deleteReservation(reservationId);
    }
}
