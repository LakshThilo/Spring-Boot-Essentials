package com.lak.boot.london.roomwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomRestController {

    private RoomServices roomServices;

    @Autowired
    public RoomRestController(RoomServices roomServices){
        super();
        this.roomServices = roomServices;
    }

    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        return roomServices.getAllRooms();
    }
}
