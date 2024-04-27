package javaLoops;

public class ForLoop1 {
//  Type For Loop 
	
	public static void main(String[] args) {
//	Requirement ==> print all the alphabets between A - Z
//		for (decalartion ; condition ; operation)      <====this are Three {for loop} requirement
		
		for (char ch = 'A' ; ch <= 'Z' ; ch++) {
			System.out.println(ch);
		}
		
		System.out.println("*********************");
//  Requirement ==> print all the small alphabets between a - z
		for (char ch = 'a' ; ch <= 'z' ; ch++) {
			System.out.println(ch);
			
		}
		
	}

}
