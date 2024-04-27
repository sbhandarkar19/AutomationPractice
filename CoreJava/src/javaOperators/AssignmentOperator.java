package javaOperators;

public class AssignmentOperator {
//	4] Assignment Operator     [ this is = equal to operator]
//	( +=, -=, *=, /=, %= this short-hand operator) We can use shorthand operator when there is a change in the same variable.
//	This operator is not used for comparison in java.

	public static void main(String[] args) {
		int a = 10;
		
//		a = a + 5;
		a += 5;      //  use this short hand operator
		System.out.println(a);  // 15
		
//		a = a - 10;
		a -= 10;
		System.out.println(a);  // 5
		
//		a = a * 2;
		a *= 2;
		System.out.println(a);  // 10 
		
//		a = a / 2;
		a /= 2;
		System.out.println(a);  // 5
		
//		a = a % 3;
		a %= 3;
		System.out.println(a);  // 2
		
		
	}

}
//  a = b + 5; ==> a += 5   ----> Not-use in shorthand operator there is a three variable [ a, b, 5 are variable]