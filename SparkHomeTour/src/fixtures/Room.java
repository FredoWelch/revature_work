package fixtures;
import java.util.Arrays;
import java.util.List;

public class Room extends Fixture {
	private Room[] exits;
	private List<String> movement = Arrays.asList("east","west", "north", "south");

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[movement.size()];
	}
	
	public Room[] getExits() {
		return exits;
	}
	
	public Room getExit(String direction) {
		return exits[movement.indexOf(direction)];
	}
	
	public List<String> getMovement(){
		return movement;
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	
	 @Override
	   public String toString() {
	       String exits = "";
	       for (String direction : this.movement) {
	          if(getExit(direction)!=null)
	         exits += (direction + ": " + getExit(direction).getShortDescription() + "\n");
	       }
	       return this.getName() + "\n\n" + this.getLongDescription() + "\n\n" + "Exits:\n" + exits;
	 }

	
}
