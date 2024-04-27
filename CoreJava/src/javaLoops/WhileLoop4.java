package javaLoops;

public class WhileLoop4 {
//	Requirement ===> Print the characters for ascii value between 48 - 127

	public static void main(String[] args) {
		
		int i = 48;
		
		while(i <= 127) {
//			System.out.println((char) i);                     //  Print only ascii value
			System.out.println(i + " : " + (char) i);         //  Print only Number & Character Ascii value
			i++;
		}
	}

}
