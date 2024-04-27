package javaSuperKeyword;
// 2] Super Statement Program
// Object class is being inherited in this program

class Car {  // Class Car extends Object
//	class Car inherits the Object class property directly
}


public class SuperStatement {   // it inherits Object Class
//	SuperStatement --> child or sub class
//	Object         --> Parent or Super Class
	

	public static void main(String[] args) {
		SuperStatement obj = new SuperStatement();
		obj.hashCode();  // hashCode() is of Object Class, but here it got inheriteds

	}

}
