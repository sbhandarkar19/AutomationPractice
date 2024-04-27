package javaSuperKeyword;
//  2] Super Statement Program

class Father1 {
	Father1() {
//		super();  it will be added by compiler by default
		System.out.println("Zero parameterized constructor of Father Class");
	}
	
	Father1(int a) {
		super();  // calls zero parameterized constructor of Object Class
		System.out.println("Int parameterized constructor of Father Class");
	}
}

class Son1 extends Father1 {
	Son1() {
//		super();  it will be added by compiler by default, it will call zero parameterized constructor of Father class
		System.out.println("Zero parameterized constructor of Son class");
	}
	
	Son1(int a) {
		super(2);  // calls Int parameterized constructor of Father class
		System.out.println("Int parameterized constructor of Son class");
	}
}

public class SuperStatement4 {

	public static void main(String[] args) {
		Son1 obj = new Son1();     //  calls zero parameterized constructor 
		Son1 obj1 = new Son1(5);   //  calls Int parameterized constructor
	}

}
