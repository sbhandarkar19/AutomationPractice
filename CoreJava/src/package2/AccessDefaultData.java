package package2;

import package1.DefaultDataClass;

public class AccessDefaultData {

	public static void main(String[] args) {
		
		DefaultDataClass obj = new DefaultDataClass();
		
//		System.out.println(obj.i);                // The field DefaultDataClass.i is not visible  // access non-static default variable.
//		System.out.println(DefaultDataClass.d);   // The field DefaultDataClass.d is not visible  // access static default variable.
//		
//		obj.defaultDisplay();                     // The method defaultDisplay() from the type DefaultDataClass is not visible  // access non-static default method.
//		DefaultDataClass.staticDefaultDisplay();  // The method staticDefaultDisplay() from the type DefaultDataClass is not visible // access static default method.

	}

}
