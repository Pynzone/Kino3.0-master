package com.adrian.cinema.repository;

import com.adrian.cinema.model.Showing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ShowingRepository extends JpaRepository<Showing,Long> {
}
