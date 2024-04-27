package javaExceptionHandling;
// Program ==> 2nd point use this program.
//         If an exception occurs in the finally block then the finally block is not completely executed.

public class FinallyBlock4 {

	public static void main(String[] args) {
//		There are three situations where finally block will not be executed.
//		1. if [System.exit(0);] statement gets executed before finally block
//		2. if the exception occurs in the in the finally block it self
//		3. if the current thread or process is death
		
		String str = null;
		try {
			
			System.out.println("character at 3rd index : " + str.charAt(3));
		} catch (NullPointerException e) {
			
		} finally {
			System.out.println("Finally block starts here");
			
			int i = 8 / 0;
			System.out.println("Finally block ends here");
		}

	}

}
