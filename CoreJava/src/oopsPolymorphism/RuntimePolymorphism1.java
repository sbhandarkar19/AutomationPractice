package oopsPolymorphism;
// 2] Run-time Polymorphism.
//    Run-time polymorphism [Method Overriding] here

class RBI {
	double rateOfInterest() {
		return 8.5;
	}
}

class SBI extends RBI {
	@Override
	double rateOfInterest() {
		return 8.7;
	}
	
	void shoppingCard() {
		System.out.println("SBI shopping card");
	}
}

class BOI extends RBI {
	@Override
	double rateOfInterest() {
		return 8.65;
	}
}

public class RuntimePolymorphism1 {

	public static void main(String[] args) {
		RBI obj = new SBI();    // upcasting
		System.out.println(obj.rateOfInterest());   // 8.7
//		obj.shoppingCard();   // The method shoppingCard() is undefined for the type RBI
		
		RBI obj1 = new RBI();
		System.out.println(obj1.rateOfInterest());  // 8.5
//		obj1.shoppingCard();  // The method shoppingCard() is undefined for the type RBI
		
		SBI obj2 = new SBI();
		System.out.println(obj2.rateOfInterest());  // 8.7
		obj2.shoppingCard();
	}
}

// We cannot change the return type of the method in case of method in case of method overriding.
// We cannot override the final method ==> Since final keyword does not allow to change the method body.
// We cannot override the static method ==> Since it does not occupy memory in the object memory.
// We cannot override the private method ==> Since private method does not get inherited.
// We can increase the visibility of the overridden method by changing its access specifier with higher visibility.
// We cannot decrease the visibility of the overridden method by changing its access specifier with lower visibility. 