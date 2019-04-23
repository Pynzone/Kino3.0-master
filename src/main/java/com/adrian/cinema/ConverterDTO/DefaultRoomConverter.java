package com.adrian.cinema.ConverterDTO;

import com.adrian.cinema.model.Room;

public class DefaultRoomConverter implements BaseConverter<Room,RoomDTO> {

    @Override
   public RoomDTO convert (Room form){
        RoomDTO room = new RoomDTO();
        room.setId_room(form.getId_room());
        room.setName(form.getName());
        return  room;
    }
}
