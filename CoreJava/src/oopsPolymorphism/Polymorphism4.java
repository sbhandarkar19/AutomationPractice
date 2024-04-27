package oopsPolymorphism;
// Program ==> Private method is not being overloaded.[Parent to child class private method cannot overloaded.
//    Private property is not inherited through inheritance. Parent to Child class.
//    If variable, method is private then you cannot inherited.
//    When will overloading occur? ==> When there is more than one method with the same name.
//    if something is private then it cannot be accessed from outside the class.
// IMP => Private class can be overloaded if it is in the same class. May be inherited,
//        But if the parent wants to overload the child by inheriting it, then that is not possible.

class Parent {
	private void car() {
		System.out.println("This is parent's car");
	}
}

class Child extends Parent {
//	Since private member of the parent class can not be inherited, therefore in the child class we have only one method
	
	private void car(int maxSpeed) {
		System.out.println("This is child class");
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.car(140);
	}
}

public class Polymorphism4 {

	public static void main(String[] args) {
		

	}

}
