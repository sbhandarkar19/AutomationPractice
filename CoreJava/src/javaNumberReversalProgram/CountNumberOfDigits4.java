package javaNumberReversalProgram;

public class CountNumberOfDigits4 {
//	Program==> 12346789 I need to check how many digits are there in this number,then Create a Method.
//	Step ==> I will keep dividing the number by 10. until he becomes zero.
	
	public static int countNumberOfDigits(int i) {
		int counter = 0;          // Count the number of divisions you are dividing.
		while ( i != 0 ) {
			i = i / 10;
			counter++;           // I would like to increase the value of the counter by 1 every time we divide.
		}
		
		return counter;
	}

	public static void main(String[] args) {
		
		System.out.println("Number of digits : " + CountNumberOfDigits4.countNumberOfDigits(123456));
		System.out.println("Number of digits : " + CountNumberOfDigits4.countNumberOfDigits(47));
		System.out.println("Number of digits : " + CountNumberOfDigits4.countNumberOfDigits(8974156));
	}

}
