package javaOperators;

public class SwepTwoVariablesValues1 {
//	Unary Operators Basic problem logic-2  without use temporary variable
//	Requirement ==> Swap/Replace two value [use without temporary variable this problem]
//	              a = 35, b = 50;
//	              a = 50, b = 35; ===> using temporary variable
//	              a = 50, b = 35; ===> without using temporary variable
	

	public static void main(String[] args) {
		int a = 35, b = 50;

		System.out.println("Before swaping");
		System.out.println("a = " + a + ", b = " + b);
		
		a = a + b; // a = 85
		
		b = a - b; // b = 85 - 50 = 35
		
		a = a - b; // c = 85 - 35 = 50
		
		System.out.println("After swaping");
		System.out.println("a = " + a + ", b = " + b);
	}

}
