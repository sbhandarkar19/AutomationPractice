package javaSuperKeyword;
// 1] Super Keyword Programs
// we cannot use Super keyword inside the Static Method & Static Block.
// we can use Super keyword inside the Non-Static Method, Non_static Block as well as inside the Constructor

class Father {
	int age = 51;               // non-static variable
	
	public void home() {        // non-static method
		System.out.println("This is father's Home");
	}
}

class Son extends Father {
	int age = 21;
	
	public void displayParentDetails() {     // Non-static method
		System.out.println("Parent age : " + super.age);
		System.out.println("Child age : "+ age);  // this.age
		super.home();
	}
}

public class SuperKeywrd1 {

	public static void main(String[] args) {
		Son obj = new Son();
		obj.displayParentDetails();
	}

}
