package javaExceptionHandling;
// Program ==> 1st point use this program [System.exit(0);)] & finally block not executed.

public class FinallyBlock3 {

	public static void main(String[] args) {
//		There are three situations where finally block will not be executed.
//		1. if [System.exit(0);] statement gets executed before finally block
//		2. if the exception occurs in the in the finally block it self
//		3. if the current thread or process is death
		
		try {
			int a = 8 / 0;
		} catch (ArithmeticException a) {
			System.out.println("Exception handled");
			System.exit(0);  // it will stop the program execution at this statement
		} finally {
			System.out.println("This is finally block");
		}

	}

}
