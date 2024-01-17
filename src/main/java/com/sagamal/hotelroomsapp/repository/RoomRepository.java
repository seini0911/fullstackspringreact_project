package com.sagamal.hotelroomsapp.repository;

import com.sagamal.hotelroomsapp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
