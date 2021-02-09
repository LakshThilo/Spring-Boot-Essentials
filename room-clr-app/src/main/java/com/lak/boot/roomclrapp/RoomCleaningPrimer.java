package com.lak.boot.roomclrapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class RoomCleaningPrimer implements CommandLineRunner {

    private RestTemplate restTemplate;

    public RoomCleaningPrimer(){
        super();
        this.restTemplate = new RestTemplate();
    }


    @Override
    public void run(String... args) throws Exception {
        String url = "http://localhost:8080/api/rooms";
        Room[] roomArray = this.restTemplate.getForObject(url, Room[].class);
        List<Room> rooms = Arrays.asList(roomArray);
        rooms.forEach(System.out::print);
    }
}
