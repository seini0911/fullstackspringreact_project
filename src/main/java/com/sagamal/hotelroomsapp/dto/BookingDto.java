package com.sagamal.hotelroomsapp.dto;

import com.sagamal.hotelroomsapp.model.Room;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookingDto {
    private Long id;
    private LocalDate checkedInDate;
    private LocalDate checkedOutDate;
    private String guestFullName;
    private String guestEmail;
    private int numberOfAdults;
    private int numberOfChildren;
    private int totalNumberOfGuests;
    private String bookingConfirmationCode;
    private RoomDto room;

    public BookingDto(Long bookingId,
                      LocalDate checkedInDate,
                      LocalDate checkedOutDate,
                      String bookingConfirmationCode) {
        this.id = bookingId;
        this.checkedInDate = checkedInDate;
        this.checkedOutDate = checkedOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
