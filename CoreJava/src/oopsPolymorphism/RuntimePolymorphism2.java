package oopsPolymorphism;
//2] Run-time Polymorphism.
// Program ==> 1] Variable & Static Method are not overridden.
//             2] This program will be inherited but not overriding. There will be hiding.
//             3] If You override a static method, it gets hidden.
// a] In the static pool, the earlier method which is inherited will be hidden & the new method will be kept visible.
// b] Overriding is possible in object memory. This is not possible in a static pool.
// c] In case of static method, the one which is inherited is hidden. Override is done in case of Non-static method.is not hidden.
// d] The override that occurs object memory. Static method are in the static pool.

class SmartWatch {
	int price = 1799;
	static double screenSize = 1.6;
	
	static void callingFeature(long mobileNum) {
		System.out.println("Calling... " + mobileNum);
	}
}

class XYZSmartWatch extends SmartWatch {
	int price = 2199;
	static double screenSize = 1.8;
	
//	callingFeature() is a static method, and it will get inherited
//	static void callingFeature(long mobileNum) {
//		System.out.println("Calling... " + mobileNum);
//	}
	
	static void callingFeature(long mobileNum) {
		System.out.println("Dailing... " + mobileNum);
		System.out.println("Calling... " + mobileNum);
	}
	
//	As the child class has the same method with different implementation/body, then inherited static method will be hidden.
}

public class RuntimePolymorphism2 {

	public static void main(String[] args) {
		SmartWatch.callingFeature(123456);
		XYZSmartWatch.callingFeature(8888477);
		
		SmartWatch obj = new XYZSmartWatch();
		System.out.println(obj.price);  // 1799
		
		XYZSmartWatch obj1 = new XYZSmartWatch();
		System.out.println(obj1.price);
		
//		non-static variable price will not be override, in object memory both price variable one from child & another from parent will be loaded,
//		but which variable to use it depends on object & reference variable.
	}
}
