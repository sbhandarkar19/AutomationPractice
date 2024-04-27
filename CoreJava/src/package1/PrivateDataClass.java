package package1;

public class PrivateDataClass {
	private int i = 55;                // private non-static variable
	private static double d = 36.18;   // private static variable
	
	private void privateDisplay() {
		System.out.println("This is non-static private method");
	}
	
	private static void staticPrivateDisplay() {
		System.out.println("This is static private method");
	}

	public static void main(String[] args) {
//		We can access private data only within the same class.
//		We cannot access private data outside the class or package.
		
		PrivateDataClass obj = new PrivateDataClass();
		
		System.out.println(obj.i);                // access non-static private variable.
		System.out.println(PrivateDataClass.d);   // access static private variable.
		
		obj.privateDisplay();                     // access non-static private method.
		PrivateDataClass.staticPrivateDisplay();  // access static private method.
	}
}
