package javaExceptionHandling;
// IMP ==>1.The program ran even after the exception occurred because the catch block hand handled it.
//        2.You can handle this exception by using try-catch block. The exception is handled. The program will not terminate. its execution will continue.

public class SimpleTryCatch {

	public static void main(String[] args) {
		System.out.println("main() starts here");
		int i = 15;
		
		try {
//			try contains statement which may generates exception object
			int j = i / 0;
		} catch (ArithmeticException e) {
//			catch block should have an arguments of the exception of the object type
		}
		
		System.out.println("main() ends here");
	}

}
