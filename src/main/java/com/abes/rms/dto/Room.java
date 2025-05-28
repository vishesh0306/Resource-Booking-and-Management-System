package com.abes.rms.dto;

import java.util.Objects;


public class Room {
	public String roomNo;
	public double price;
	public String type;
	
	public static double acRoom = 1000;
	public static double nonacRoom = 1800;
	
	public Room(String roomNo, String type){
		this.roomNo = roomNo;
		this.type = type.toLowerCase();
		
		if(this.type.equals("AC".toLowerCase())) {
			this.price = acRoom;
		}
		else if(this.type.equals("NonAC".toLowerCase())) {
			this.price = nonacRoom;
		}
		
	}
	
	public String toString() {
		return this.roomNo + "\t" + this.type + "\t" + this.price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, roomNo, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(roomNo, other.roomNo) && Objects.equals(type, other.type);
}


