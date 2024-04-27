package oopsAbstraction;

// Program ==> Abstraction level ( calculator class )(0 - 100%)
// Total 3 abstract method ==> 1] 2 abstract method (66.66 %) 2] 1 non-abstract method (33.33 %)
//                              100/3 = 33.33 %. [2 abstract method + 1 non-abstract method]
// Requirement of the constructor takes place so that the constructor can make chaining in the abstract. inherited through.
abstract class Calculator {     // abstract / incomplete class
//	we can set the abstraction level between 0 - 100%
//	abstract class can have abstract and non-abstract methods
//	abstract class contains constructor, but we can not create its Object as it is incomplete class
	
	abstract public int addition();           // abstract method  [33.33%]
	abstract public double multiplication();  // abstract method  [33.33%]
	
	public void displyName() {                // non-abstract method [33.33%]
		System.out.println("This is Casio Calculator");
	}
}

public class Abstraction1 {  // non-abstract class / concrete / complete class

	public static void main(String[] args) {
//		Calculator obj = new Calculator();   // Cannot instantiate the type Calculator as it is incomplete classs 
	}
}
