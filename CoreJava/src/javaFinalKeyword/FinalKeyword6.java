package javaFinalKeyword;

public class FinalKeyword6 {
//	When will you initialize the global non-static final blank variable through the help of [Constructor] & help of [Non-Static Block].
//	1] If the value of the Object to Object is not changing then help of [Non-Static block] will be used.
//	2] If the value of the Object to Object is changing then help of [Constructor] will be used.
	
//	solve this program is help of [Constructor] because object to object changing the value.
	
	final double height;
	
	FinalKeyword6(double h) {                  //   [FinalKeyword6] this is Constructor  
		height = h;
	}

	public static void main(String[] args) {
		FinalKeyword6 obj = new FinalKeyword6(6);
		System.out.println(obj.height);
		
		FinalKeyword6 obj1 = new FinalKeyword6(5.8);
		System.out.println(obj1.height);
	}

}
