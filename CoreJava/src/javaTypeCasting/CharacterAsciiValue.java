package javaTypeCasting;
// Program ==> to get the ascii value from the character , or to get the character from the ascii value we can use type casting.
//             All letter ascii value print.
//        Type casting will be done but specifically this type casting will neither be in narrowing nor in widening.

public class CharacterAsciiValue {

	public static void main(String[] args) {
//		to get the ascii value from the character , or to get the character from the ascii value we can use type casting.
		
		char ch = 'b';
		int b = ch;     // here ascii value of 'b' will be stored in variable b
		System.out.println(b);
		
		int a = 97;
		char ch1 = (char) a; // here character having 97 as ascii value will be stored in variable ch1.
		System.out.println(ch1);
		
//		All letter ascii value print.
		for (char ch2 = 'A'; ch2 <= 'Z'; ch2++) {
//			System.out.println((int) ch2);
			int i = ch2;
			System.out.println(i);
		}
	}
}
