package javaExceptionHandling;
// throw ==> An exception has to be created & throw in the program itself. Due to this the execution of the program stops.To do this the "throw keyword" will do it.
//           You will not be able to use the throw keyword outside the condition.
//           Always write throw keyword in the condition statement. if written outside, it will always terminate the program.

public class ThrowKeyword {

	public static void main(String[] args) {
		System.out.println("Please enter you username and password");
		
		String userName = null;
		String password = "Test@123";
		
//		throw new NullPointerException();          // write the throw keyword condition outside
		
		if (userName == null) {
//			throw new NullPointerException();      // write the throw keyword condition inside
			throw new NullPointerException("please enter username");
		}
		if (password == null) {
//			throw new NullPointerException();      // write the throw keyword condition inside
			throw new NullPointerException("please enter password");
		}
		
		System.out.println("Login is successfull");

	}

}
