package javaFinalKeyword;

public class FinalKeyword4 {
//	This program ==> there are 2 ways to initialize the global non-static final blank variable.
//	                  1] non-static variable can be initialized with the help of [Constructor].
//	                  2] non-static variable can be initialized with the help of [Non-Static Block]
//	IMP ==> Global/Local variable can be declared & initialized in the class body & main method body first line using the Final Keyword variables
//	solve this program help of [Constructor].
	
	final double d;       // non-static blank final variable
	
	FinalKeyword4(){            //   [FinalKeyword4] this is Constructor then solve this program
		d = 3.14;
	}
	public static void main(String[] args) {
		 
        FinalKeyword4 obj = new FinalKeyword4();
        
        System.out.println(obj.d);
        
//        obj.d = 12.10;
	}

}
