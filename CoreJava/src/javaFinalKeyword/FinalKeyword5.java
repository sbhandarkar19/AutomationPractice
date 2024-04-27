package javaFinalKeyword;

public class FinalKeyword5 {
//	This program ==> there are 2 ways to initialize the global non-static final blank variable.
//    1] non-static variable can be initialized with the help of [Constructor].
//    2] non-static variable can be initialized with the help of [Non-Static Block]
//	IMP ==> Global/Local variable can be declared & initialized in the class body & main method body first line using the Final Keyword variable
//  solve this program help of [Non-Static Block].
	
	final char ch;            // non-static blank final variable
	
	{                         // created Non-Static block
		ch = 'a';
	}

	public static void main(String[] args) {
		FinalKeyword5 obj = new FinalKeyword5();
		
		System.out.println(obj.ch);
		
//		obj.ch = 'z';

	}

}
