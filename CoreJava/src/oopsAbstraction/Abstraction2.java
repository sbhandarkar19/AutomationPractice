package oopsAbstraction;
// Program ==> How can one provide a body through inheritance.
//             How can we call this method.

abstract class Calculator1 {   // abstract / incomplete class
	                           // { Calculator1 class body only showing essential information }
	abstract public int addition(int a, int b );               // abstract method
	
	abstract public double multiplication(int a, int b);      // abstract method
	
}

class CalculatorSubClass extends Calculator1 {    // { Calculator1 internal/hidden information hide for CalculatorSubClass }
//	here it is necessary to provide body to the inherited abstract methods
	@Override
	public int addition (int a, int b) {
		return a + b;
	}
	
	@Override
	public double multiplication(int a, int b) {
		return a * b;
	}
}

public class Abstraction2 {    // non-abstract class / concrete / complete class

	public static void main(String[] args) {
//		Calculator1 obj = new Calculator1();  // Cannot instantiate the type Calculatoe1 since it is abstract / incomplete class.
		
		Calculator1 obj = new CalculatorSubClass();  // upcasting {child class object referred by parent class variable}
//		{I have created an object of the child/sub class but will create a reference of the parent class(Calculator1).
		System.out.println("Addition : " + obj.addition(4, 3));
		System.out.println("Multiplication : " + obj.multiplication(8, 2));
	}

}
