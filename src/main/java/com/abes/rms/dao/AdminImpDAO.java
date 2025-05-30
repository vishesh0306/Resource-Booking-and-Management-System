package com.abes.rms.dao;

import java.util.ArrayList;

import com.abes.rms.dto.Admin;
import com.abes.rms.dto.RegularUser;
import com.abes.rms.util.CollectionsUtil;

public class AdminImpDAO implements AdminDAO{

	@Override
	public boolean isAdminPresent(String userID, String pass) {
		if(CollectionsUtil.admin.getId().equals(userID) && CollectionsUtil.admin.getPass().equals(pass)) return true;
		return false;
	}
	
	@Override
	public Admin getAdmin(String userID, String pass) {
		if(CollectionsUtil.admin.getId().equals(userID) && CollectionsUtil.admin.getPass().equals(pass)) return CollectionsUtil.admin;
		return null;
	}
	
	@Override
	public ArrayList<RegularUser> showUsers() {
		return CollectionsUtil.users;
	}

}
