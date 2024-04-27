package javaConstructor;

public class Constructor4 {
//	A single class can have more than one constructor, possible with Constructor Overloading.
//	Constructor Overloading Program.( this program use for 3rd rule )
//	This program solve by Constructor Overloading 3 rules.
//	      1] Number of parameter should be different.
//	      2] Type of parameter should be different. ( type - data type )
//	      3] Position of parameter should be different.
	
	Constructor4(int a, double d) {
		System.out.println("int double parameterized");
	}
	
	Constructor4(double d, int a) {
		System.out.println("double int parameterized");
	}
		
	public static void main(String[] args) {
		System.out.println("Main method starts here");
		
		Constructor4 obj = new Constructor4(3, 8.7);  // Calling int double parameterized constructor
		
		Constructor4 obj1 = new Constructor4(4.2, 7); // Calling double int parameterized constructor
		

	}

}
