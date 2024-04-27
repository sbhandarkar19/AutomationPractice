package javaExceptionHandling;
// The program will execute regardless of whether an exception occurs or not by using the finally block.
// I am writing data from a file or reading that data. To use it we will use [FileInputStream].

public class FinallyBlock1 {

	public static void main(String[] args) {
//		case 1 ==> 1st case is Exception handle
		
		try {
			int i = 5 / 0;
		} catch (ArithmeticException e) {
			
		} finally {
//			it will be executed in both the cases if the exception is handled or not
			System.out.println("This is finally block1");
		}
		
//		case 2 ==> 2nd case is Exception can not handle
		
		try {
			int[] arrInt = new int[3];
			arrInt[4] = 8;
		} catch (ArithmeticException e) {
			
		} finally {
//			it will be executed in both the cases if the exception is handled or not
			System.out.println("This is finally block2");
		}

	}

}
