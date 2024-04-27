package javaObjectClass;
// Program ==> Override all three methods.

public class ObjectClassPract1 extends Object {
//	as ObjectClassPract1 class inherits the Object Class, therefore methods of Object Class will be inherited in this class.
	
	@Override
	 public String toString() {
		 return "This is overriden method";
	 }
	
	@Override
	 public int hashCode() {
		 return 150;
	 }
	 
	@Override
	 public boolean equals(Object obj) {
		 return true;
	 }

	public static void main(String[] args) {
		
		ObjectClassPract1 obj = new ObjectClassPract1();
		System.out.println(obj);                // This is overriden method
		System.out.println(obj.toString());     // This is overriden method

		System.out.println(obj.hashCode());     // 150
		
		ObjectClassPract1 obj1 = new ObjectClassPract1();
		System.out.println(obj.equals(obj1));   // true
	}
}
