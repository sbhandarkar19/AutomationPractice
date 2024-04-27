package oopsInheritance;
// 1] Single Inheritance Type

class ParentClass {
	String familyName = "Verma";               // Non-static Variable
	static double bankBalance = 1500.00;       // Static Variable
	
	public void car() {                        // Non-static Method
		System.out.println("Parent's Car");
	}
	
	public static void home() {                // Static Method
		System.out.println("Parent's Home");   
	}
}

public class ChildClass extends ParentClass {
	
//	ChildClass extends ParentClass ==> ChildClass will inherit the properties of ParentClass
//	extends keyword is used in Java to achieve inheritance

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		
		System.out.println("Family name : " + obj.familyName);
		System.out.println("Bank balance : " + ChildClass.bankBalance);
		
		obj.car();
		ChildClass.home();
	}

}
