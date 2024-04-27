package javaExceptionHandling;
// A class will be created with the name with which you want to create the exception.
// Program ==> How do you want to create/handle a user define checked exception.[compile time]
//             Three different way of the creating class. you can anther way creating class.

class TestDataNotFoundException extends Exception {
//	as we are extending Exception class therefore this class will become a checked exception class
	
}

class TestDataNotFoundExceptionWithDescription extends Exception {
//	as we are extending Exception class therefore this class will become a checked exception class
	public TestDataNotFoundExceptionWithDescription() {
		System.out.println("Test Data file path is either invalid or null");
	}
}

class TestDataNotFoundExceptionWithDescription1 extends Exception {
//	as we are extending Exception class therefore this class will become a checked exception class
	public TestDataNotFoundExceptionWithDescription1(String s) {
		super(s);
	}
}

public class UserDefinedCheckedException {

	public static void main(String[] args) throws TestDataNotFoundException, TestDataNotFoundExceptionWithDescription, TestDataNotFoundExceptionWithDescription1 {
		
		
		String dataFilePath = null;
		if (dataFilePath == null) {
//			throw new TestDataNotFoundException();
//			throw new TestDataNotFoundExceptionWithDescription();
			throw new TestDataNotFoundExceptionWithDescription1("Test Data file path is either invalid or null");
		}
		
		System.out.println("main() ends here");

	}

}
