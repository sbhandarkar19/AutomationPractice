package oopsPolymorphism;
// 1] Compile-time polymorphism.
//    Compile-time polymorphism [Method Overloading] here

public class Polymorphism1 {
//	Method Overloading: Creating more than one method with same name in same class is called Method Overloading
//	To achieve method overloading we have to follow below rules
//	1. Number of parameter in the method should be different
//	2. Data type of parameter should be different
//	3. Position of parameter should be different
	
//	public static int addition() {
//		return 3 + 5;
//	}
	
	public static int addition(int a, int b) {
		int add = a + b;
		return add;
	}
	
	public int addition() {
		int a = 30, b = 40;
		return a + b;
	}
	
	void addition(int a, int b, int c) {
		int add = a + b + c;
		System.out.println("Addition is " + add);
	}

	public static void main(String[] args) {
//		during compilation java will understand the which method is to be executed at what time,
//		this is way it is called compile time polymorphism
		
		Polymorphism1 obj = new Polymorphism1();
		obj.addition(2, 8, 4);
		
		System.out.println(Polymorphism1.addition(15, 25));
		
		System.out.println(obj.addition());

	}

}
