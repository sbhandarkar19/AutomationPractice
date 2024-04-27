package package1;

public class DefaultDataClass {
	int i = 55;                // default non-static variable
	static double d = 36.18;   // default static variable
	
	void defaultDisplay() {
		System.out.println("This is non-static default method");
	}
	
	static void staticDefaultDisplay() {
		System.out.println("This is static default method");
	}

	public static void main(String[] args) {
//		We can access default data only within the same class & within the same package.
//		We cannot access default data outside the package.
		
		DefaultDataClass obj = new DefaultDataClass();
		
		System.out.println(obj.i);                // access non-static default variable.
		System.out.println(DefaultDataClass.d);   // access static default variable.
		
		obj.defaultDisplay();                     // access non-static default method.
		DefaultDataClass.staticDefaultDisplay();  // access static default method.
	}
}
