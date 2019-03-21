package com.adrian.cinema.Service;

import com.adrian.cinema.exception.ResourceNotFoundException;
import com.adrian.cinema.model.Reservation;
import com.adrian.cinema.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;


    public List<Reservation> getAllReservation()
    {
        return reservationRepository.findAll();
    }

    public Reservation createReservation(Reservation reservation)
    {
        return reservationRepository.save(reservation);
    }

    public Reservation getReservationById(Long reservationId)
    {
        return reservationRepository.findById(reservationId).
                orElseThrow(()->new ResourceNotFoundException("Reservation","id_reservation",reservationId));
    }

    public Reservation updateReservation(Long reservationId,Reservation reservationDetails)
    {
        Reservation reservation = reservationRepository.findById(reservationId).
                orElseThrow(()-> new ResourceNotFoundException("Reservation","id_reservation",reservationId));

        reservation.setShowingId(reservationDetails.getShowingId());
        reservation.setUsserId(reservationDetails.getUsserId());
        Reservation updatedReservation = reservationRepository.save(reservation);
        return updatedReservation;
    }

    public ResponseEntity<?> deleteReservation(Long reservationId)
    {
        Reservation reservation = reservationRepository.findById(reservationId).
                orElseThrow(()->new ResourceNotFoundException("Reservation","id_reservation",reservationId));
        reservationRepository.delete(reservation);
        return ResponseEntity.ok().build();
    }
}
