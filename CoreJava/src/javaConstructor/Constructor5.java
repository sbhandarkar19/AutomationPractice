package javaConstructor;

public class Constructor5 {
//	Default constructor here in this program.
//	User is not define a Constructor in this program.
//	What can be the impact of user defined constructor or how can we implement it.
	
	int i;        // global non-static variable only declared, not initialized.
	double d;     // global non-static variable only declared, not initialized.
	
	String str;   // global non-static variable only declared, not initialized.

	public static void main(String[] args) {
		
//		If we do not assign/initialized value in global variable, then complier assign the default value to it.
		
		Constructor5 obj = new Constructor5();
		
		System.out.println(obj.i);
		System.out.println(obj.d);
		System.out.println(obj.str);
		
//		compiler will assign the default values, & constructor loaded the variable with default value in the object memory. 
		
	}

}
