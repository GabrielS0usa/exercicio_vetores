package entities;

public class Rooms {
	
	private String name;
	private String email;
	private int rooms;
	
	public Rooms(int j) {
		this.rooms = j;
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

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	
	
}
