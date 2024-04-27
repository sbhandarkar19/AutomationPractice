package javaVariables;

public class GlobalVariable2 {
	int i;                        // non-static variable
	static int i1;                // static variable
	
	static char ch = 'a';         // static variable
	char ch1 = 'A';               // non-static variable
	
	static double d;
	
	public static void main(String[] args) {
		GlobalVariable2 rubber = new GlobalVariable2();    // object is created (object name is pen/obj/rubber etc)
		
		System.out.println(rubber.i1);                // accessing static variable using (class object).
		System.out.println(i1);                    // accessing static variable using (variable name).
		System.out.println(GlobalVariable2.i1);    // accessing static variable using (class name).
		
	}

}
