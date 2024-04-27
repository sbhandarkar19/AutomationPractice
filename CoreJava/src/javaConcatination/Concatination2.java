package javaConcatination;

public class Concatination2 {
//	Concatination1 Advance Example Concept.
//	VBODMAS = Viniculum, Bracket, Of, Division, Multiply, Addition, Subtraction

	public static void main(String[] args) {
		int a = 50, b = 4;
		System.out.println(a + b);
		System.out.println("Addition of 50 and 4 is :" + a + b);               // Addition of 50 and 4 is :504 (Console)
		System.out.println("Addition of 50 and 4 is :" + ( a + b));            // Addition of 50 and 4 is :54 (Console)
		
		System.out.println(a + "Hello java" + b);
		
		System.out.println(a + b + " is the addition of 50 and 4");            // 54 is the addition of 50 and 4 (Console)
		
		System.out.println(a + b + " is the addition of 50 and 4 " + a + b);   // 54 is the addition of 50 and 4 504 (Console)
		
//		I want to print the statement as ===> 50 + 4 = 54
		
		System.out.println("50 + 4 = " + (a + b));                             // 50 + 4 = 54 (Console)
		
		System.out.println(a + " + " + b + " = " + (a + b));                   // 50 + 4 = 54 (Console)
		
//		I want to print the statement as ===> 50 * 4 = 200
		System.out.println(a + " * " + b + " = " + (a * b));                   // 50 * 4 = 200 (Console)
		
//		I want to print the statement as ===> 50 / 4 = 12.5
		float a1 = 50;                                                         // (float & double) should be used decimal number answer  
		System.out.println(a1 + " / " + b + " = " + (a1 / b));                 // 50.0 / 4 = 12.5 (Console) 
		
//		I want to print the statement as ===> 50 - 4 = 46
		System.out.println(a + " - " + b + " = " + (a - b));                   // 50 - 4 = 46 (Console)
		
//		I want to print the statement as ===> 50 % 4 = 2
		System.out.println(a + " % " + b + " = " + (a % b));                   // 50 % 4 = 2 (Console)
				
	}

}
