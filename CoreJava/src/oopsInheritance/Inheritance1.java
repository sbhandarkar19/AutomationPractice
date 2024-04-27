package oopsInheritance;
// 2] Multilevel Inheritance Type

class GrandParent {
	int grandParentAge = 75;       // Non- static variable
	
	public void home() {           // Non-Static Method
		System.out.println("Grand Parent Home");
	}
}

class Parent extends GrandParent {
//	int grandParentAge = 75;
//	public void home()
	
	int carMaxSpeed = 140;                  // non-static method
	  
	public void car() {                     // non-static method
		System.out.println("Parent Car") ;
	}
}

class Child extends Parent {
//	int grandParentAge = 75;
//	public void home()
//	int carMaxSpeed = 140;
//	public void car()
	
	public void bike() {                // non-static method
		System.out.println("Child Bike");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println("Grand Parent Age : " + obj.grandParentAge);  // calling non-static variable
		System.out.println("Car maximum speed : " + obj.carMaxSpeed);    // calling non-static variable
		
		obj.home();          // calling non-static method
		obj.car();           // calling non-static method
		obj.bike();          // calling non-static method
	}

}
// Parent class cannot inherit the properties of child class
// Only child class will inherit the parent class properties