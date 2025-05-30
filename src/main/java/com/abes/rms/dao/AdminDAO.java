package rms.dao;

import java.util.ArrayList;

import rms.dto.Admin;
import rms.dto.RegularUser;

public interface AdminDAO {
	public boolean isAdminPresent(String userID, String pass);
	public Admin getAdmin(String userID, String pass);
	public ArrayList<RegularUser> showUsers();
}
