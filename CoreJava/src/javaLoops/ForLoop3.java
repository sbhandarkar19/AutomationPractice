package javaLoops;

public class ForLoop3 {
//	Create method in Global Variable
	
	public static void printEvenNumbers() {     // Condition Statement used Logic Program 1 
//		Replace For Shortcut (i = i + 1) ====> i++
		
		for(int i = 2; i <= 200; i++) {         // [For Loop] is used to iterate between 1 - 200 
			if((i % 2) == 0) {                  // [Condition statement] is used to check number is even or not    
				System.out.println(i);
			}
		}
	}
	
	public static void printEvenNumber1() {     // Not used Condition statement program logic 2 (Simple logic)
//		Replace For Shortcut (i = i + 2) ====> i += 2
		
		for(int i = 2; i <= 200; i += 2) {
			System.out.println(i);
		}
	}
	
	public static void printlnOddNumbers() {
		for(int i = 1; i <= 200; i++) {
			if((i % 2) != 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {                         
//	Requirement ==> print all the Even Numbers between 1 - 200
		ForLoop3.printEvenNumbers();                             //   Condition Statement used Logic Program 1 
		
		System.out.println("******************");
		
//	Requirement ==> print all the Odd Numbers between 1 - 200
		ForLoop3.printlnOddNumbers();
		
		System.out.println("******************");                  
		ForLoop3.printEvenNumber1();                            //  Not Used Condition Statement program logic 2 (Simple logic)
		
		
		
//		for(int i = 2;i <= 400;i = i +2 ) {         Extra Even Number
//			System.out.println(i);                 Extra Even Number
		
		
		System.out.println("***********************");
//		for(int i = 1; i <= 300; i = i +4 ) {      Extra Odd Number
//			System.out.println(i);                 Extra Odd Number
		}
		}
	


