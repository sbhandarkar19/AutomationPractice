package javaString;

public class StringPrograms {
	
	public String reverseString(String s) {
		char[] arrCh = new char [s.length()];
		
		for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
			arrCh[j] = s.charAt(i);
		}
		
		String revStr = new String(arrCh);
//		System.out.println("Reverse of provided String : " + revStr);
		return revStr;
	}
	
	public void splitReversal(String s) {
		String[] arrStr = s.split(" ");
		
		for (int i = 0; i <= arrStr.length - 1; i++) {
			System.out.print(this.reverseString(arrStr[i]) + " ");
		}
		System.out.println();
	}
	
	public void stringDigitAddition(String s) {
		int addition = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			if (Character.isDigit(s.charAt(i))) {
				addition = addition + Character.getNumericValue(s.charAt(i));
			}
		}
		System.out.println("Addition of digits present in the String : " + addition);
	}
	
//	arrCh = r, e, v, i, r, D, ......

	public static void main(String[] args) {
		StringPrograms obj = new StringPrograms();
		String str = "Java Selenium WebDriver";
		
//		1] reverse the given string ---> "revirDbeW muineleS avaJ"
		System.out.println("Reverse of provided String : " + obj.reverseString(str));
		
		
//      2] split reverse the given string as ---> "avaJ muineleS revirDbeW"
		obj.splitReversal(str);
		
//		3] perform the addition of digits present in the string
		String str1 = "T1hi23s i4s g5ar9den8";
		
		obj.stringDigitAddition(str1);
	}
}

// Assignment Que: Write a Java program to find the occurrence count (frequency) of characters present in the Srting
// Consider "Java Selenium WebDriver"
// Expected Output
// J = 1
// a = 2
// v = 2
