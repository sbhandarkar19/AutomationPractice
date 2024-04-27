package javaMethods;

public class MethodPractice3 {
//	We have to create a method and in it we have to perform the task of addition repeatedly and we have to return the value of whatever addition the method does.
	
//	develop a method which should be accessible from any location, and it should take two numbers as input
//	 and perform the addition of these numbers, and return the addition value
	public static int additionOfNumber(int a, int b) {
		int add = a + b;
		return add;
//		System.out.println("Addition is " + add);     // this will give error as "Unreachable Code" as it is written 
		                                              // after return statement
	} 
	
//	Java program execution will always starts from main method and ends on main method only. And the execution happens
//	step-by-step (line by line) in main method
	
//	to execute other methods we have to call them from main method as and when required
	public static void main(String[] args) {
		
	}

}
