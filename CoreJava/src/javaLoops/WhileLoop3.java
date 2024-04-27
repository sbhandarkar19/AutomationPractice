package javaLoops;

public class WhileLoop3 {
//	Requirement ==> Print the ascii value of a - z

	public static void main(String[] args) {
		
		char ch = 'a';
		
		System.out.println("Character" + " " + "Ascii value");
		
		while (ch <= 'z') {
//			System.out.println((int)ch);                      // Print only ascii value                   Ex console === 97 98 99 ..... 
//			System.out.println(ch + " " + (int) ch);          // Print only character & ascii value       Ex console === a 97, b 98,c 99 .....
			System.out.println(ch + "\t\t" + (int) ch);
			ch++;
		}
		
	}

}

// \t ===> tab key

// I want that ->  a 97
//                 b 98
//                 c 99

// Assignment ==> print the ascii values of A - Z