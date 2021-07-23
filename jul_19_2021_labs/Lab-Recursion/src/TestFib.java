
public class TestFib {
	
	public static void main(String[] args) {
		
		Fib fib = new Fib();
		
		int results = fib.fibonacci(2);
		System.out.println(results);
		
		results = fib.fibonacci(23);
		System.out.println(results);
		
		results = fib.fibonacci(7);
		System.out.println(results);
	}

}
