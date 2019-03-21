package com.adrian.cinema.Service;

import com.adrian.cinema.controller.RoomController;
import com.adrian.cinema.exception.ResourceNotFoundException;
import com.adrian.cinema.model.Room;
import com.adrian.cinema.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@Service
public class RoomService  {
    @Autowired
    RoomRepository roomRepository;
    //pokaż Wsio
    public List<Room> getAllRoom() {
        return roomRepository.findAll();
    }
    //tworzenie

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }
    //Pokaż 1 konkretny
    public Room getRoomById(Long roomId) {
        return roomRepository.findById(roomId)
                .orElseThrow(() -> new ResourceNotFoundException("Room", "id_room", roomId));
    }
   //Edycja
    public Room updateRoom(Long roomId,Room roomDetails) {

        Room room = roomRepository.findById(roomId)
                .orElseThrow(() -> new ResourceNotFoundException("Room", "id_room", roomId));

        room.setName(roomDetails.getName());

        Room updatedRoom = roomRepository.save(room);
        return updatedRoom;
    }
        //Usuwanie
    public ResponseEntity<?> deleteRoom(Long roomId) {
        Room room = roomRepository.findById(roomId)
                .orElseThrow(() -> new ResourceNotFoundException("Room", "id_room", roomId));
        roomRepository.delete(room);
        return ResponseEntity.ok().build();
    }


}
