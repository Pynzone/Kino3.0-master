package com.adrian.cinema.controller;

import com.adrian.cinema.Service.MovieService;
import com.adrian.cinema.Service.RoomService;
import com.adrian.cinema.exception.ResourceNotFoundException;
import com.adrian.cinema.model.Room;
import com.adrian.cinema.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomController {
    private final RoomService roomService;
    @Autowired
    RoomController(RoomService roomService){
        this.roomService=roomService;
    }
    @GetMapping("/room")
    public List<Room> getAllRoom() {
        return roomService.getAllRoom();
    }
    @PostMapping("/room")
    public Room createRoom(@Valid @RequestBody Room room) {
        return roomService.createRoom(room);
    }
    @GetMapping("/room/{id_room}")
    public Room getRoomById(@PathVariable(value = "id_room") Long roomId) {
        return roomService.getRoomById(roomId);
    }
    @PutMapping("/room/{id_room}")
    public Room updateRoom(@PathVariable(value = "id_room") Long roomId,
                           @Valid @RequestBody Room roomDetails) {
        return roomService.updateRoom(roomId,roomDetails);
    }
    @DeleteMapping("/room/{id_room}")
    public ResponseEntity<?> deleteRoom(@PathVariable(value = "id_room") Long roomId) {
        return roomService.deleteRoom(roomId);
    }
}
