
public class ClassB {
	
	ClassA cA = new ClassA();
	
	public static void main(String[] args) {
		
		ClassB cB = new ClassB();
		cB.cA.setName("Freddie");
		
		System.out.println(cB.cA.getName());
	}

}
