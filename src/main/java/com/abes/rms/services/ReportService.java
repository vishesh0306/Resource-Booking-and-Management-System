package com.abes.rms.services;

import com.abes.rms.dao.BookingImpDAO;
import com.abes.rms.dao.RoomImpDAO;
import com.abes.rms.dto.Room;

public class ReportService {
	public Room maxBookedRoom() {
		int maxi = 0;
		Room temp = null;
		for(Room room : new RoomImpDAO().getAllRooms()) {
			if(room.getCount() > maxi) {
				maxi = Math.max(maxi, room.getCount());
				temp = room;
			}
		}
		return temp;
	}
	
	public int totalBooking() {
		return new BookingImpDAO().getNoOfBookings();
	}
	
	public double revenue() {
		return new BookingImpDAO().calcRevenue();
	}
}
