package com.sagamal.hotelroomsapp.controller;

import com.sagamal.hotelroomsapp.dto.RoomDto;
import com.sagamal.hotelroomsapp.model.Room;
import com.sagamal.hotelroomsapp.service.IRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rooms")
public class RoomController {

    private final IRoomService roomService;

    @PostMapping("/add/new-room")
    public ResponseEntity<RoomDto> addNewRoom(
            @RequestParam("photo") MultipartFile photo,
            @RequestParam("roomType") String roomType,
            @RequestParam("roomPrice") BigDecimal roomPrice)
            throws SQLException, IOException {
        Room savedRoom = roomService.addNewRoom(photo, roomType, roomPrice);
        RoomDto roomDto = RoomDto.builder()
                .id(savedRoom.getId())
                .roomType(savedRoom.getRoomType())
                .roomPrice(savedRoom.getRoomPrice())
        .build();

        return ResponseEntity.ok(roomDto);
    }
}
