package javaFinalKeyword;

public class FinalKeyword3 {
//	This Program ==> there is 1 way to initialize the global static final blank variable
//	                    1] static variable can be initialized with the help of [Static Block].
	
//  IMP ==> If the final variable in the global variable is not initialized, the compiler will initialize the default value.
//	IMP ==> Global/Local variable can be declared & initialized in the class body & main method body first line using the Final Keyword variable
	static final int a;  // blank final variable ==> static blank final variable
	
	static {
		a = 61;
	}

	public static void main(String[] args) {
		
        System.out.println(FinalKeyword3.a);
        
//        FinalKeyword3.a = 35;
	}

}
