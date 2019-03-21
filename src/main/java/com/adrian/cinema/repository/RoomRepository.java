package com.adrian.cinema.repository;

import com.adrian.cinema.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoomRepository extends JpaRepository<Room,Long>{
}
