package javaTypeCasting;
//Casting Type ==> 2] Derived or Non-Primitive Casting.
//                    b] Explicit Down Casting
// Downcasting will have to be done explicitly. 
// Program ==> To downcast, first upcast & then downcast the upcasting object.
//    imp  ==> We cannot downcast the parent class object directly.
//             Before Upcasting ==> car1 car1 = new BMW1();
//             After Downcasting ==> BMW1 bmw1 = (BMW1) Car1;

class Car1 {
	int maxSpeed = 140;
	
	void buttonStart() {
		System.out.println("press the button to start the car");
	}
}

class BMW1 extends Car1 {
//	int maxSpeed = 140;  // inherited variable
//	void buttonStart()   // inherited method
	
	int seatingCapacity = 4;
	
	void autoDoorOpeningClosing() {
		System.out.println("Doors will open & close automatically");
	}
}

public class DowncastingPractice {

	public static void main(String[] args) {
//		we cannot downcast the parent class object directly
		
//		BMW1 bmw = new Car1();           // type mismatch error
//		BMW1 bmw = (BMW1) new Car1();    // it gives ClassCastException
		
//		for downcasting first we have to upcast the object, then downcast the upcasted object
		
		Car1 car1= new BMW1();     // Upcasting
		
		System.out.println(car1.maxSpeed);
//		System.out.println(car1.seatingCapacity);  // not accessible since child class variable
		car1.buttonStart();
//		car1.autoDoorOpeningClosing();             // not accessible since child class method
		
		BMW1 bmw1 = (BMW1) car1;    // Downcasting the Upcasting object
		
		System.out.println(bmw1.maxSpeed);
		System.out.println(bmw1.seatingCapacity);  
		bmw1.buttonStart();
		bmw1.autoDoorOpeningClosing();             
	}
}
