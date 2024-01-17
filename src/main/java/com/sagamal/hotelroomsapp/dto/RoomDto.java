package com.sagamal.hotelroomsapp.dto;

import lombok.*;
import org.apache.tomcat.util.codec.binary.Base64;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private Boolean isBooked = false;
    private List<BookingDto> bookings;
    private String photo;

    public RoomDto(Long id, String roomType, BigDecimal roomPrice) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public RoomDto(Long id,
                   String roomType,
                   BigDecimal roomPrice,
                   Boolean isBooked,
                   List<BookingDto> bookings,
                   byte[] photoBytes) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isBooked = isBooked;
        this.bookings = bookings;
        this.photo = photoBytes != null ? Base64.encodeBase64String(photoBytes) : null;
    }
}
