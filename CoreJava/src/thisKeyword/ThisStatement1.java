package thisKeyword;

public class ThisStatement1 {
//	this statement should always be first statement in the constructor.
//	to create constructor chaining of the same class we can use this statement.
//	constructor chaining is process of calling one constructor from another constructor.
//	Requirement ==> I want to execute zero parameterized, int parameterized & boolean parameterized constructor while creating object.
	
	ThisStatement1(){
//		this();         // Recursive constructor invocation ThisStatement1()
		this(4);        // call int parameterized constructor
		System.out.println("Zero parameterized constructor");
//		this(4);        // Constructor call must be the first statement in a constructor
	}
	
	ThisStatement1(int a){
		System.out.println("Int parameterized constructor");
	}
	
	ThisStatement1(boolean flag){
		System.out.println("Boolean parameterized constructor");
	}

	public static void main(String[] args) {
//		creating object of the class
//		ThisStatement1 obj = new ThisStatement1();       // calling zero parameterized constructor
		
		System.out.println("************************");
		ThisStatement1 obj1 = new ThisStatement1();      // calling Zero parameterized constructor

	}

}
