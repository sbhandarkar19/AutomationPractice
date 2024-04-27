package javaConstructor;

public class Constructor3 {
//	A single class can have more than one constructor, possible with Constructor Overloading.
//	Constructor Overloading Program.( this program use for 1 & 2 rule )
//	This program solve by Constructor Overloading 3 rules.
//	      1] Number of parameter should be different.
//	      2] Type of parameter should be different. ( type - data type )
//	      3] Position of parameter should be different.
	
	Constructor3() {
		System.out.println("This is zero parameterized constructor");
		
	}
	
    Constructor3(int a) {
    	System.out.println("This is int parameterized constructor");
		
	}

    Constructor3(double d1) {
    	System.out.println("This is double parameterized constructor");
	
    }

	public static void main(String[] args) {
		System.out.println("Main method starts here");
		
		Constructor3 obj = new Constructor3();      // Calling zero parameterized constructor
		
		Constructor3 obj1 = new Constructor3(5);      // Calling int parameterized constructor
		
		Constructor3 obj2 = new Constructor3(5.1);      // Calling double parameterized constructor
		
	}

}
