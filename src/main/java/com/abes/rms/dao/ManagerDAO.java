package rms.dao;

import rms.dto.ResourceMan;

public interface ManagerDAO {
	public boolean addUser(String id, String pass, String name, String email);
	public boolean verifyUser(String userID, String pass);
	public ResourceMan getUser(String userID, String pass);
	public boolean isManagerPresent(String userID, String pass);
}
