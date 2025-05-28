package rms.dto;

import java.util.ArrayList;

public class CustomerDTO {
	
	private String id;
	private String name;
	private String email;
	
	public CustomerDTO(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CustomerDTO(String id, String name, String email) {
		this(id, name);
		this.email = email;
	}
	
	public ArrayList<RoomDTO> rooms = new ArrayList<RoomDTO>();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}



