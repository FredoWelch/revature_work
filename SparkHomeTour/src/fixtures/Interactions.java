package fixtures;

import java.util.Arrays;
import java.util.List;

public class Interactions extends Fixture {
	private Interactions[]items;
	private List<String> itemsList = Arrays.asList("tv", "grill", "sofa", "fridge");
	
	
	public Interactions(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.items = new Interactions[itemsList.size()];
		
	}
	public Interactions[] getItems() {
		return items;
	}
	
	public Interactions getItems(String object) {
		return items[itemsList.indexOf(object)];
		
	}


	public List<String> getItems() {
		return items;
	}
	



	public void setItems(Interactions[] items) {
		this.items = items;
	}


	
	/*@Override
	   public String toString() {
	       String items = "";
	       for (String object : this.itemsList) {
	          if(getItems(object)!=null)
	         items += (object + ": " + getItems(object).getShortDescription() + "\n");
	       }
	       return this.getName() + "\n\n" + this.getLongDescription() + "\n\n" + "Items:\n" + items;
	 }*/


	

	

}
