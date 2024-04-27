package javaTypeCasting;
// If the Object Final then the value of the variable can be changed.
// Variable are final cannot be changed.
// If you do not want to upcast & downcast the object once it is created, finalize the object.

class Fruit {
	int numberOfFruits = 25;
}

class Apple extends Fruit {
	int applePrice = 200;
}

public class FinalObject {

	public static void main(String[] args) {
		final Apple obj = new Apple();
		
		System.out.println("Before price change : " + obj.applePrice);
		obj.applePrice = 250;
		System.out.println("After price change : " + obj.applePrice);
		
//		obj = new Apple();  // The final local variable obj cannot be assigned.
//		final reference variable cannot be used to refer other object
//		Even though created object is final, we can change the values of variables of the object
		
		Apple obj1 = new Apple();
		
		obj1 = new Apple();
		
		final Fruit fr = new Apple();   
		
//		fr = new Fruit();
	}
}
