package com.adrian.cinema.repository;

import com.adrian.cinema.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long>{
}
