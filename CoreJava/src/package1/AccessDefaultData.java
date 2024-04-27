package package1;

public class AccessDefaultData {

	public static void main(String[] args) {
		
		DefaultDataClass obj = new DefaultDataClass();
		
		System.out.println(obj.i);                // access non-static default variable.
		System.out.println(DefaultDataClass.d);   // access static default variable.
		
		obj.defaultDisplay();                     // access non-static default method.
		DefaultDataClass.staticDefaultDisplay();  // access static default method.

	}

}
