package com.abes.rms.dto;

public class BookingDto {
	public String id;
	public CustomerDTO cust;
	public RoomDTO room;
	public double totalCost;
	public int timeDuration;
	
	BookingDto(String id,CustomerDTO cust,RoomDTO room,int timeDuration){
		this.id=id;
		this.cust=cust;
		this.room=room;
		this.totalCost=room.costPerHour*timeDuration;
		this.timeDuration=timeDuration;
	}
	
}
