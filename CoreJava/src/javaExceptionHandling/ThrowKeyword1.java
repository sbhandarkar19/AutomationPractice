package javaExceptionHandling;

public class ThrowKeyword1 {
	public void division(int a, int b) {
		System.out.println("division method starts here");
		
		System.out.println("Division : " + ( a / b));
		
//		as it can be observed that at line 6 arithmetic exception can occur,
//		we should either handle it or we should declare that, this method may produce arithmetic exception
		System.out.println("division method ends here");
	}

	public static void main(String[] args) {
		System.out.println("main() starts here");
		
		String str = "CalculatorOperation";
		System.out.println(str);
		
		ThrowKeyword1 obj = new ThrowKeyword1();
		obj.division(15, 0);
		
		System.out.println("main() ends here");

	}

}
