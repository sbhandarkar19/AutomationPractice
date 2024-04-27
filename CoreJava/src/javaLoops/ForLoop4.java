package javaLoops;

public class ForLoop4 {
//	The correct way to write the {For Loop} today point
//	Deceleration before For Loop
//	Operation after For Loop

	public static void main(String[] args) {
		char ch = 'a';           //   1) Deceleration before declare and initialize For loop
		int i = 1;               //   2) Deceleration before declare and initialize For loop
		
		for( ; ch <= 'z'; ) {         // (1)
			System.out.println(ch);
			ch++;                     // Operation after For Loop
		}
		
		for( ; i <= 10; ) {           // (2)
			System.out.println(i);
			i++;                      // Operation after For Loop
		}

	}

}
