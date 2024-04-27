package javaOperators;

public class TernaryOperator1 {
//	2] Ternary Operator
//	Requirement ==> Have to find out which of these [int a = 20, b = 25] numbers is bigger.
//	syntax ==> [condition ? if true : if false]
//	        1] If the condition is true, then after (?) question mark part will be executed.
//	        2] If the condition is false, then after (:) colon mark part will be executed.

	public static void main(String[] args) {
		int a = 20, b = 25;
		int maxNum;
		
		maxNum = (a > b) ? a : b;
		System.out.println("Maximum number is : " + maxNum);
		

	}

}
