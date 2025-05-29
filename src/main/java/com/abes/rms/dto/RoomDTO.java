package com.abes.rms.dto;


import java.util.Objects;


public class RoomDTO {
	public String id;
	public String name;
	public String type;
	public double costPerHour;
	public boolean isAvailaible;
	
	public RoomDTO(String id, String name, String type, double costPerHour) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.costPerHour = costPerHour;
		this.isAvailaible=true;
	}
	
	@Override
	public String toString() {
		System.out.println("-----------------------------------------------------------------------------------");
		return "RoomID: " + id + ", Room Name: " + name + ", Type: " + type + ", Cost/hour: " + costPerHour + ", isAvailable: " + isAvailaible;
	}

	@Override
	public int hashCode() {
		return Objects.hash(costPerHour, id, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoomDTO other = (RoomDTO) obj;
		return Double.doubleToLongBits(costPerHour) == Double.doubleToLongBits(other.costPerHour)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(type, other.type);
	}
}

