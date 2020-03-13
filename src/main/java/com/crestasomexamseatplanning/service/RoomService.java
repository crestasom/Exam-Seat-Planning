package com.crestasomexamseatplanning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crestasomexamseatplanning.model.Room;
import com.crestasomexamseatplanning.repo.RoomRepo;

@Service
public class RoomService {
	@Autowired
	RoomRepo rRepo;

	public void save(Room room) {
		rRepo.save(room);
	}
}
