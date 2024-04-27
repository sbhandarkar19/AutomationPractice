package javaAssigementProbem;

public class TernaryOperator1 {
//	Greatest Number one line 

	public static void main(String[] args) {
		int a = 15, b = 20, c = 10;
		int maxNum;
		
		maxNum = ( a > b && a > c) ? a : ( b > a && b > c ) ? b : c;
		
		System.out.println("Maximum number is : " + maxNum);
	}

}
