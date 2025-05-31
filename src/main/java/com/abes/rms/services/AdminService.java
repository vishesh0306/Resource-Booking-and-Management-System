package com.abes.rms.services;

import java.util.ArrayList;

import com.abes.rms.dao.*;
import com.abes.rms.dto.Admin;
import com.abes.rms.dto.Booking;
import com.abes.rms.dto.RegularUser;

public class AdminService {
	AdminImpDAO adminObj = new AdminImpDAO();
	BookingImpDAO bookingObj = new BookingImpDAO();
	UserImpDAO userObj = new UserImpDAO();
	
	public boolean verifyUser(String userID, String pass) {
		return adminObj.isAdminPresent(userID, pass);
	}
	public Admin getUser(String userID, String pass) {
		return adminObj.getAdmin(userID, pass);
	}
	
	public ArrayList<RegularUser> showAllUsers() {
		return adminObj.showUsers();
	}
	
	public ArrayList<Booking> showAllBookings() {
		return bookingObj.showBookings();
	}
	
	public boolean deleteUser(RegularUser user) {
		return userObj.deleteUser(user);
	}
}
