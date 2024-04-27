package oopsPolymorphism;
// Program ==> Final method is being overloaded & that too in the same class.

public class Polymorphism5 {
	
	public final void display() {
		System.out.println("Final method with zero parameter");
	}
	
	final void display(boolean flag) {
		System.out.println("Flag value is " + flag);
	}

	public static void main(String[] args) {
		Polymorphism5 obj = new Polymorphism5();
		
		obj.display();
		obj.display(false);

	}

}
