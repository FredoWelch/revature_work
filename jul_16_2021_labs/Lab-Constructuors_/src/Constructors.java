
public class Constructors {
	
	public Constructors(int value) {
		System.out.println(value);
	}
	 public Constructors(){
	        System.out.println("Default constructor ran.");
	    }
	
	public static void main(String[] args) {
		
		Constructors c = new Constructors(6);
		
		Constructors noArgC = new Constructors();
		
	}

}
