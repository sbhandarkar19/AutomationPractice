package javaArray;

public class SingleDemensionArray3 {

	public static void main(String[] args) {
//		how to declare & initialize array in single statement
//		Syntax:
//		     data_type[] arrayName = {data1,data2,data3,....};
		
		char[] arrVowelChar = {'a', 'e', 'i', 'o', 'u'};
		
		System.out.println("Size of array : " + arrVowelChar.length);
		
		for (char ch : arrVowelChar) {
			System.out.println(ch);
		}
 	}
}
