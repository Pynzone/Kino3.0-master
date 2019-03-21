package com.adrian.cinema.repository;

import com.adrian.cinema.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {
}