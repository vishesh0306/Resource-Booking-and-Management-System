package rms.service;

import java.util.ArrayList;

import rms.dao.*;
import rms.dto.Admin;
import rms.dto.Booking;
import rms.dto.RegularUser;

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
