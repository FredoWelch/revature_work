package game;
import java.util.List;

import fixtures.Interactions;
import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room [] rooms;
	Interactions[] items;
	
	public void walk() {
		Room livingRoom = new Room("The living room", "A common area for the family", "Nice mid-century living room with couch and love seat for seating and a 55inch Tv for entertainment");
		List <String> movement = livingRoom.getMovement();	
		Room[] rooms = new Room[movement.size()];
		this.startingRoom = livingRoom;
		
		Interactions tv = new Interactions("Television", null, null);
		
		
		
		Room kitchen = new Room("The kitchen", "A spacious kitchen", "A spacious kitchen with a island and huge stainless steel Sub-Zero refrigerator");
		Room lowerDen = new Room("The lower den", "A smaller living room area", "A smaller living room area fitted with throw pillows big bag chairs as well as games");
		Room patio = new Room("Patio", "A wooden deck with a grill", "A spacious wooden deck with a grill, retractable awning, and glass table");
		
		
		Interactions grill = new Interactions("The Grill", "Black and Deck Grill", null);
		Interactions sofa = new Interactions("Leather Sofa", "A nice sectional", null);
		Interactions fridge = new Interactions("The Fridge", "Sub-Zero Fridge", null);
		
		
		rooms[movement.indexOf("north")] = kitchen;
		rooms[movement.indexOf("west")] = lowerDen;
		rooms[movement.indexOf("east")] = patio;
		livingRoom.setExits(rooms);
		
		rooms = new Room[movement.size()];
		rooms[movement.indexOf("south")] = livingRoom;
		rooms[movement.indexOf("east")] = lowerDen;
		kitchen.setExits(rooms);
		
		rooms = new Room[movement.size()];
		rooms[movement.indexOf("north")] = patio;
		rooms[movement.indexOf("west")] = kitchen;
		rooms[movement.indexOf("east")] = livingRoom;
		lowerDen.setExits(rooms);
		
		rooms = new Room[movement.size()];
		rooms[movement.indexOf("south")] = lowerDen;
		rooms[movement.indexOf("west")] = livingRoom;
		patio.setExits(rooms);
				
		
	}
	

}
