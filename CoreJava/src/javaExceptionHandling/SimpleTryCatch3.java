package javaExceptionHandling;
// Program ==> At a time a try catch block can handle only one exception
//             Exception trace see then use method [.printStackTrace].

public class SimpleTryCatch3 {

	public static void main(String[] args) {
//		At a time a try catch block can handle only one exception
		
		System.out.println("main() starts here");
		String str = null;
		try {
			
			System.out.println("try block starts here");
			
			int i = 5 / 0;   // ArithmeticException
			System.out.println("*****");
			System.out.println("Size of string : " + str.length());  // NullPointerException
			
			System.out.println("try block ends here");
			
		} catch (RuntimeException e) {
			e.printStackTrace();   // Exception trace see then use method [.printStackTrace]. 
		}
		
		System.out.println("main() ends here");

	}

}
