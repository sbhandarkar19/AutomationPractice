package oopsAbstraction;
// Abstraction level==> Interface (100%) because only one method create

// Program ==> Will we discuss about interfaces and how to create interfaces.
//             How is an abstraction achieve by creating an interface.
// To create an interface, I will use the class keyword as the interface keyword.
// Interface does not have a constructor.
// Cannot have abstract method in complete class.
// While writing abstract method in child/sub class, remove abstract keyword.

interface Mobile {
	int ram = 5;                                     // compiler write here by default ==> public static final ram = 5;

	void calling(long mobileNumber);                 // compiler write here by default ==> public abstract void calling(long mobileNumber);
									

//	Abstract methods do not specify a body
//	void message(String message) {  
//		
//	}
}

//  We will inherited the interface in the child/sub class & "implements" & "extends" keyword in front of it. 
class Nokia3120 implements Mobile {
//	public static final ram = 5;
//	public abstract void calling(long mobileNumber);
	
//	Remove abstract keyword while writing abstract method in child/sub class.
//	The body is providing the method which is there in child/sub class.That means @Override.
	@Override
	public void calling(long mobileNumber) {
		System.out.println("Calling: " + mobileNumber);
	}
}

public class Interface1 {

	public static void main(String[] args) {
//        Mobile obj = new Mobile();                 s // We cannot create the object of interface as it does not contains constructor
		
		Mobile obj = new Nokia3120(); // Upcasting
		obj.calling(888884777);
		
		System.out.println("RAM Size: " + Mobile.ram);
		System.out.println("RAM Size: " + Nokia3120.ram);
	}
}
