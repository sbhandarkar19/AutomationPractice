package oopsInheritance;
//  3] Hierarchical Inheritance Type

class Bike {
	int maxSpeed = 110;           // non-static variable
	
	public void start() {         // non-static method
		System.out.println("Bike start Method");
	}
}

class HondaUnicorn extends Bike {
//	int maxSpeed = 110;
//	public void start()
		
	public void monoSuspension() {
		System.out.println("Honda Unicorn has mono suspension");
	}
}

class YamahaFZ extends Bike {
//	int maxSpeed = 110;
//	public void start()
	
	public void stop() {
		System.out.println("Bike Stop Method");
	}
}

class RoyalEnfieldGT650 extends Bike{
//	int maxSpeed = 110;
//	public void start()
	
	public void engine() {
		System.out.println("GT60 has 650cc Engine");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		HondaUnicorn uni = new HondaUnicorn();
		System.out.println("***HondaUnicorn***");
		System.out.println(uni.maxSpeed);
		uni.start();
		uni.monoSuspension();
		
		YamahaFZ fz = new YamahaFZ();
		System.out.println("***YamahaFZ***");
		System.out.println(fz.maxSpeed);
		fz.start();
		fz.stop();
//		fz.monoSuspension();  cannot access other class data
		
		RoyalEnfieldGT650 gt650 = new RoyalEnfieldGT650();
		System.out.println("***RoyalEnfieldGT650***");
		System.out.println(gt650.maxSpeed);
		gt650.start();
		gt650.engine();
//		gt650.stop();
//		gt650.monoSuspension();
		
	}

}
