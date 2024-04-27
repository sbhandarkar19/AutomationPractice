package javaExceptionHandling;
// Program ==> lets handle the exception here, we will use try catch block.

public class ThrowKeyword2 {
	
	public void division (int a, int b) {
		System.out.println("division methods starts here");
		
//		lets handle the exception here
		try {
			System.out.println("Division : " + (a / b));
		} catch (ArithmeticException e) {
			
		}
		
//		as it can be observed that at line 6 arithmetic exception can occur,
//		we should either handle it or we should declare that, this method may produce arithmetic exception
		System.out.println("division method ends here");
	}

	public static void main(String[] args) {
		System.out.println("main() starts here");
		
		String str = "CalculatorOperation";
		System.out.println(str);
		
		ThrowKeyword2 obj = new ThrowKeyword2();
		obj.division(15, 0);
		
		System.out.println("main() ends here");

	}

}
