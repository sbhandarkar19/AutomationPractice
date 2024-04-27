package javaImmutableClass;
// Program ==> Immutable class
// To Create Immutable class refer below points:
//   1. Class & its data members(variable) should be declared as final
//   2. Constructor should be parameterized, so that above data members(variable) can be initialize
//   3. Only getter() method should be written in the class for data members(variable)

final class Bike {
	final int maxSpeed;
	final double fuelTankCapacity;
	final double milleage;
	
	Bike(int maxSpeed, double fuelTankCapacity, double milleage) {
		this.maxSpeed = maxSpeed;
		this.fuelTankCapacity = fuelTankCapacity;
		this.milleage = milleage;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public double getFuelTankCapacity() {
		return fuelTankCapacity;
	}

	public double getMilleage() {
		return milleage;
	}
}

public class ImmutableClassPract {

	public static void main(String[] args) {
//		here class Bike is immutable class, since we cannot change the values of variable once the object is created
		Bike honda = new Bike(240, 20.5, 22.8);
		
//		we cannot change the values of variable once object is created
//		honda.maxSpeed = 280;
//		honda.fuelTankCapacity = 24.8;
//		honda.milleage = 26.8;
		
//		in order to have different values we have to create new object
		honda = new Bike(280, 24.8, 26.8);
	}
}
