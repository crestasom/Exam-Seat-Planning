package com.crestasomexamseatplanning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int roomId;
	private String roomNo;
	private int capacity;

	public Room(String roomNo, int capacity) {
		this.roomNo = roomNo;
		this.capacity = capacity;
	}
}
