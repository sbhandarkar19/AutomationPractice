package oopsPolymorphism;
// Program ==> claas to class private method overloading.
// Private means it becomes a pacific class property.
// Method overloading concepts ==> Creating more than one method in the same class with one name, 
//                                 if the method is private then we can create more than one method.                                  

public class Polymorphism3 {
	
	private void display() {
		System.out.println("Nothing to display");
	}
	
	private void display(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		Polymorphism3 obj = new Polymorphism3();
		obj.display();
		obj.display("We can overload private method");
	}
}
