package javaSuperKeyword;
//  2] Super Statement Program

class ParentClass {
//	ParentClass inherits the Object Class
//	default constructor is present
	public void home() {
		System.out.println("Parent Home");
	}
}

class ChildClass extends ParentClass {
//	ChildClass inherits the ParentClass
	ChildClass() {
//		super();
		System.out.println("Child class constructor");
	}
	
	public void bike() {
		System.out.println("Child bike");
	}
}

public class SuperStatement3 {

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.home();
		obj.bike();
		obj.hashCode();
	}

}
