package javaFinalKeyword;

public class FinalKeyword1 {
//	This program is ==> it can be used with variable, method and class.
//	In Global/Local variable,we can make it constant(final) by writing final in front of the variable.
//	While calling the final keyword in the global variable,an object has to be created.
//	Just write final in front of variable,it will not change.
//	IMP ==> Global/Local variable can be declared & initialized in the class body & main method body first line using the Final Keyword variable
	final char ch = 'A';
	

	public static void main(String[] args) {
		final double pi = 3.14;
		System.out.println(pi);
		
//		pi = 4.15; // cannot perform this operation as pi is declared as final
		System.out.println(pi);
		
		final String str = "Java-Selenium";
		System.out.println(str);
		
//		str = "Java-Selenium"; // cannot perform this operation as str is declared as final
		
//		FinalKeyword1 obj = new FinalKeyword1();
//		obj.ch = 'Z';
		

	}

}
