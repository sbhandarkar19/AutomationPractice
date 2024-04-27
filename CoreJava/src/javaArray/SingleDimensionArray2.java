package javaArray;
//How to print the array element :

//1] using for loop
//2] using for-each loop
//3] using Arrays class

// Program ==> print array in reverse order using for loop

import java.util.Arrays;

public class SingleDimensionArray2 {

	public static void main(String[] args) {
		String[] arrStr = new String[3];
		
		arrStr[0] = "Java";
		arrStr[1] = "Selenium";
		arrStr[2] = "RestAssured";
		
//		print the size of this array
		System.out.println("String Array Size : " + arrStr.length);
		
//		print array element using for loop
		System.out.println("*****for-loop*****");
		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		
//		print array in reverse order using for loop
		System.out.println("*****Reverse Order*****");
		for (int j = arrStr.length - 1; j >= 0; j--) {
			System.out.println(arrStr[j]);
		}
		
//		print array element using for-each loop
		System.out.println("*****for-each loop*****");
		for (String str : arrStr) {
			System.out.println(str);
		}
		
//		print array elements using Arrays Class
		System.out.println("*****Arrays-Class- toString() loop*****");
		System.out.println(Arrays.toString(arrStr));
	}
}
