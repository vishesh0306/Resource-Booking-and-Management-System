package rms.dto;

import java.util.*;

@SuppressWarnings("resource")
public class Customer extends User{
	
	public Customer(String id, String pass, String name) {
		super(id, pass, name);
	}
	
	public Customer(String id, String pass, String name, String email) {
		super(id, pass, name, email);
	}
	
}
