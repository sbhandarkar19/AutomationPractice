package javaSuperKeyword;
//  2] Super Statement Program

class Vehicle {
	int maxSpeed = 140;
}

class Bike extends Vehicle {
	Bike() {
//		Super(); by default this will be added by compiler
//		here Super() will call zero parameterized constructor of Vehicle class
		System.out.println("Bike class zero parameterized constructor");
	}
	
	public void bikeStartStop() {
		System.out.println("Start or Stop the bike");
	}
}

public class SuperStatement2 {

	public static void main(String[] args) {
		Bike honda = new Bike();
		System.out.println(honda.maxSpeed);
		honda.bikeStartStop();
	}

}
