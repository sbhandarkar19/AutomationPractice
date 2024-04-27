package package1;

public class ProtectedDataClass {
	protected int i = 55;                          // protected non-static variable
	protected static double d = 36.18;             // protected static variable
	
	protected void protectedDisplay() {
		System.out.println("This is non-static protected method");
	}
	
	protected static void staticProtectedDisplay() {
		System.out.println("This is static protected method");
	}

	public static void main(String[] args) {
//		We can access protected data only within the same package & outside the package through child class

		
		ProtectedDataClass obj = new ProtectedDataClass();
		
		System.out.println(obj.i);                      // access non-static protected variable.
		System.out.println(ProtectedDataClass.d);       // access static protected variable.
		
		obj.protectedDisplay();                         // access non-static protected method.
		ProtectedDataClass.staticProtectedDisplay();    // access static protected method.
	}
	
}
