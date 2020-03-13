package com.crestasomexamseatplanning.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crestasomexamseatplanning.model.Room;

public interface RoomRepo extends JpaRepository<Room, Integer> {

}
