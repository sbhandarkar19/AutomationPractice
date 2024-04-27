package javaTypeCasting;
// Casting Type ==> 2] Derived or Non-Primitive Casting.
//                     a] Up casting [implicit / auto up / explicit casting]

class Car {
	int maxSpeed = 140;
	
	void buttonStart() {
		System.out.println("press the button to start the car");
	}
}

class BMW extends Car {
//	int maxSpeed = 140;  // inherited variable
//	void buttonStart()   // inherited method
	
	int seatingCapacity = 4;
	
	void autoDoorOpeningClosing() {
		System.out.println("Doors will open & close automatically");
	}
}

public class UpcastingPractice {

	public static void main(String[] args) {
		Car car = new BMW();   // upcasting or auto upcasting or implicit upcasting
		
		System.out.println(car.maxSpeed);
//		System.out.println(car.seatingCapacity);  // not accessible since child class variable
		car.buttonStart();
//		car.autoDoorOpeningClosing();             // not accessible since child class method
		
		Car car1 = (Car) new BMW();     // explicit upcasting
		
		BMW bmw = new BMW();
		
		System.out.println(bmw.maxSpeed);
		System.out.println(bmw.seatingCapacity);  
		bmw.buttonStart();
		bmw.autoDoorOpeningClosing();            
		
		Car car2 = bmw;    // upcasting or auto upcasting or implicit upcasting
		System.out.println(car2.maxSpeed);
//		System.out.println(car2.seatingCapacity);  // not accessible since child class variable
		car2.buttonStart();
//		car2.autoDoorOpeningClosing();             // not accessible since child class method
		
		Car car3 = (Car) bmw;  // explicit upcasting
	}
}
