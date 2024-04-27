package javaBlocks;

public class StaticBlockPractice1 {
//  Why use static blocks?  this program
	
	static int i;           // static declared only, no initialization
	public static double d; // static declared only, no initialization
	
	static {
//	initializing static variables	
		i = 25;
		d = 3.14; 
	}
	
	public static void main(String[] args) {
	    System.out.println(StaticBlockPractice1.i);
	    System.out.println(StaticBlockPractice1.d);
	}

}
// can we create static variables in any method ==> No
// can we create public,protected,default,private variables in any method ==> No