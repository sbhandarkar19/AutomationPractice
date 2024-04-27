package javaExceptionHandling;
// Imp ==>1. If an exception is not thrown in the try block, the catch block will not execute.
//        2. This is why the catch block is written. If there is exception in try block, handle it.

public class SimpleTryCatch1 {

	public static void main(String[] args) {
		System.out.println("main() starts here");
		int i = 15;
		
		try {
//			try contains statement which may generates exception object
			System.out.println("Try block starts here");
			
			String str = "HelloJava";
			System.out.println("character at 3 index : " + str.charAt(3));
			
			System.out.println("Try block here");
		} catch (ArithmeticException e) {
//			catch block should have an arguments of the exception of the object type
			System.out.println("Inside the catch block");
		}
		
		System.out.println("main() ends here");
	}

}
