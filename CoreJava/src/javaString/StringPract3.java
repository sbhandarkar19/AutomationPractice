package javaString;

import java.util.Arrays;

// Program ==> Different inbilt method of string class.

public class StringPract3 {

	public static void main(String[] args) {
		String str1 = "Java Language";
//		In string characters are stored on index basis, & indexing starts from zero
		
//		1] how to retrieve character at any index
		char ch = str1.charAt(0);
		System.out.println("Character at zero index : " + ch);
		System.out.println("Character at fifth index : " + str1.charAt(5));
		
//		2] how to number of character present in the String 
		int str1Size = str1.length();
		System.out.println("Number of characters in str1 : " + str1Size);
		
//		3] how to get substring from main string
		String subString = str1.substring(5);        // 5 is starting index of substring
		System.out.println("Substring from index 5 : " + subString);
		
		String subString1 = str1.substring(0, 4);   // as last index provided is 4 it will take characters till index 3
		System.out.println("Substring between index 0 to 4 : " + subString1);
		
//		4] how to concat different strings
		String str2 = "OOPs language";
		String strConcat = str1.concat(str2);
		System.out.println("Str1 and Str2 concat : " + strConcat);
		System.out.println("Selenium " .concat("Java"));
		System.out.println(str1.concat("Easy language"));
		
//		5] how to get the index of any character or starting indexing of any substring
		int indexOfL = str1.indexOf('L');
		System.out.println("Index of L : " + indexOfL);
		System.out.println("Index of n : " + str1.indexOf('m'));
//		the index of the first occurrence of the character in the character sequence represented by this object,
//		or -1 if the charecter does not occur.
		System.out.println("Index of a : " + str1.indexOf('a'));
		
		System.out.println("Index of a after 5th index : " + str1.indexOf('a', 5));
		
		System.out.println("Starting index of Language : " + str1.indexOf("Language"));
		System.out.println("Staring index of language in str2 : " + str2.indexOf("language"));
		System.out.println("Starting index of QA : " + "QA is responsibal for testing in QA env ".indexOf("QA", 10));
		
//		6] how to check equality, literal wise comparison, cannot object wise.
//		case sensitive this ignore the compare
		String s1 = "apple";
		String s2 = "APPLE";
		String s3 = "Apple";
		
		System.out.println("Comparing two string ignoring case : " + (s1.equalsIgnoreCase(s2)));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		String upperCaseStr = s1.toUpperCase();
		System.out.println("Upper case of s1 : " + upperCaseStr);
		
		System.out.println("Upper case of s1 : " + (str1.toUpperCase()));
		
		String lowerCaseStr = s2.toLowerCase();
		System.out.println("Lower case of s2 : " + lowerCaseStr);
		System.out.println("Lower case of s3 : " + (s3.toLowerCase()));
		
//		7] how to white space remove
//		this is only start & end wide space remove, cannot in-between space remove, this is in-between space remove is another method use.
		String a1 = "Java Selenium";
		String a2 = " Java Selenium";
		String a3 = "Java Selenium ";
		String a4 = "Java Selenium WebDrive";
//		in this case a1, a2, & a3 has white space either on beginning or end or at both the place
		System.out.println("trim a1 : " + a1.trim());
		System.out.println("trim a2 : " + a2.trim());
		System.out.println("trim a3 : " + a3.trim());
		System.out.println("trim a4 : " + a4.trim());
		
//		8] how to replace a character or substring from the main string
		String a5 = a4.replace('S', '$');
		System.out.println("a4 after replacement of s : " + a5);
		
		a5 = a4.replace("Java", "Python");
		System.out.println("a4 after replacement of Java : " + a5);
		
//		9] how to remove a character or substring from the main string
		a5 = a4.replace(" ", "");  // it will remove the white space if present
		System.out.println("a4 after removing white space : " + a5);
		
		a5 = a4.replace("Selenium", "");
		System.out.println("a4 after removing Selenium : " + a5);
		
		a5 = a4.replace('e', 'E');
		System.out.println("a4 after replacing Selenium : " + a5);
		
		a5 = a4.replaceFirst("e", "E");
		System.out.println("a4 after replacing e to E at first place : " + a5);
		
//		10] how to verify whether the string object is empty or not
		boolean flag = a4.isEmpty();  // return true if string length is zero, otherwise returns false
		System.out.println("Is a4 empty : " + flag);
		
		String a6 = "";
		System.out.println("Is a6 empty : " + a6.isEmpty());
		
//		11] how to split the string
		String[] arrStr1 = a4.split(" ");   // it will split a4 based on white space
		System.out.println(Arrays.toString(arrStr1));
		
		arrStr1 = a4.split(" ", 2);    // it will split a4 based on white space in 2 parts only
		System.out.println(Arrays.toString(arrStr1));
	}
}
