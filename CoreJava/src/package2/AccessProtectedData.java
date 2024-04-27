package package2;

import package1.ProtectedDataClass;

public class AccessProtectedData {

	public static void main(String[] args) {
//		We cannot access protected data of outside the package directly.

		ProtectedDataClass obj = new ProtectedDataClass();
//
//		System.out.println(obj.i);                     // access non-static protected variable.
//		System.out.println(ProtectedDataClass.d);      // access static protected variable.
//
//		obj.protectedDisplay();                        // access non-static protected method.
//		ProtectedDataClass.staticProtectedDisplay();   // access static protected method.
	}

}
