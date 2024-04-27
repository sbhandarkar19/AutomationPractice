package javaOperators;

public class SwapTwoVariableValues {
//	Unary Operators Basic problem logic-1 use temporary variable
//	Requirement ==> Swap/Replace two value [use temporary variable this problem]
//	              a = 35, b = 50;
//	              a = 50, b = 35; ===> using temporary variable
//	              a = 50, b = 35; ===> without using temporary variable

	public static void main(String[] args) {
		int a = 35, b = 50, temp;
		
		System.out.println("Before swaping");
		System.out.println("a = " + a +", b = " + b);
		
		temp = a;
		a = b;
		b = a;
		
		System.out.println("After swaping");
		System.out.println("a = " + a + ", b = " + b);
		

	}

}
