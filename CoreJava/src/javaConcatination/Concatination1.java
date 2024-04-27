package javaConcatination;

public class Concatination1 {

	public static void main(String[] args) {
//		Concatination1 Simple Example Concept.
//		Concatination is use only (+)Addition operator other than No use (/)Division,(*)Multiplication,(-)Subtraction
		
		int a = 50, b = 4;
		
		int addition = a + b;
		System.out.println("Addition of 50 and 4 is : " + addition);
		
		int subtraction = a - b;
		System.out.println("Subtraction of 50 and 4 is : " + subtraction);
		
		int multiplication = a * b;
		System.out.println("Multiplication of 50 and 4 is :" + multiplication);
		
//		int division = a / b;           //  50 / 4 = 12.5
		double division = a / b;        //  here we get result as 12 only since both a and b are of int type
		System.out.println("Division of 50 and 4 is :" + division);
		
		double a1 = 50;
		division = a1 / b;
//		here we get result as 12.5 since either of two numbers in divisions is of (double)decimal/floating type
		System.out.println("Division of 50.0 and 4 is : " + division);
		
		int remainder = a % b;     // % is called mood in java.  // The number obtained by dividing both the numbers is called reminder.
		System.out.println("Remainder of division of 50 and 4 is :" + remainder);
		
		

	}

}
