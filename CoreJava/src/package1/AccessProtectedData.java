package package1;

public class AccessProtectedData {

	public static void main(String[] args) {

		ProtectedDataClass obj = new ProtectedDataClass();

		System.out.println(obj.i);                     // access non-static protected variable.
		System.out.println(ProtectedDataClass.d);      // access static protected variable.

		obj.protectedDisplay();                        // access non-static protected method.
		ProtectedDataClass.staticProtectedDisplay();   // access static protected method.
	}

}
