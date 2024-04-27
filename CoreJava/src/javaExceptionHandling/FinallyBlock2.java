package javaExceptionHandling;
// IMP ==> 1. There can be zero or more catch blocks with a single try block, but the finally block will be the same.
//         2. In case of try block, it is not necessary to have catch block, but it is necessary to have finally block.
//         3. If there is no catch block then the exception will not be handled.

public class FinallyBlock2 {

	public static void main(String[] args) {
//		A single try block is can have zero or more catch blocks
//		a single try block can have only one finally block
//		if try block has no catch block then it should have finally block
		
//		if catch block is not provided then exception will not get handled
		String str = null;
		try {
			System.out.println("String size : " + str.length());
		} finally {
			System.out.println("this is finally block");
		}

	}

}
