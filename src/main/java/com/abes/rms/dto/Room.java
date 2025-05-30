package com.abes.rms.dto;

import java.util.Objects;

import com.abes.rms.dao.RoomImpDAO;

public class Room {
	private int count = 0;
	private String id;
	private String type;
	private double costPerHour;
	private boolean isAvailable;
	
	public Room(String id, String type, double costPerHour) {
		this.id = id;
		this.type = type;
		this.costPerHour = costPerHour;
		this.isAvailable = true;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "RoomID: " + id + ", Room Type: " + type + ", Cost/hour: " + costPerHour + ", isAvailable: " + isAvailable ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(costPerHour, count, id, type);
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
		return Double.doubleToLongBits(costPerHour) == Double.doubleToLongBits(other.costPerHour)
				&& count == other.count && Objects.equals(id, other.id) && Objects.equals(type, other.type);
	}
	
}
