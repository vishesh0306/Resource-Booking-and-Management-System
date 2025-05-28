package com.abes.rms.services;

import java.util.Iterator;

import Database2.HotelDatabase;
import Entity.Customer;
import Entity.HotelManager;

public class ManagerServices {

	
public static boolean managerLogin(String email, String password) {

		Iterator<HotelManager> managerIterator = HotelDatabase.hotelManagers.iterator();
        
        while(managerIterator.hasNext()) {
        	HotelManager manager = managerIterator.next();
        	if(manager.email.equals(email)) {
        		if(manager.password.equals(password)) {
        			return true;
        		}
        		else {
        			return false;
        		}
        	}
        }
        return false;
		
	}

public static void seeAllCustomers(){
	
	if(HotelDatabase.customers.size() == 0) {
		System.out.println("No Customers");
		return;
	}
	
	Iterator<Customer> customer = HotelDatabase.customers.iterator();
	while(customer.hasNext()) {
		System.out.println(customer.next());
	}
	System.out.println();

}
	
	
}
