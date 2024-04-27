package package2;

import package1.PublicDataClass;

public class AccessPublicData {

	public static void main(String[] args) {
//		We can access public data only within the same package & outside the package.

		
		PublicDataClass obj = new PublicDataClass();
		
		System.out.println(obj.i);                      // access non-static public variable.
		System.out.println(PublicDataClass.d);       // access static public variable.
		
		obj.publicDisplay();                         // access non-static public method.
		PublicDataClass.staticPublicDisplay();    // access static public method.
	}


}
