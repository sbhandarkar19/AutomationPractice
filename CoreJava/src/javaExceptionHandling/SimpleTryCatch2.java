package javaExceptionHandling;
// IMP ==> 1.If any exception comes on the line in the try block, the execution will directly jump to the catch block.
//         2.In try block if exception occurs at specific line, then execution control will directly go to catch block,
//           and remaining statement of try block will not be executed.

public class SimpleTryCatch2 {

	public static void main(String[] args) {
		System.out.println("main() starts here");
		int i = 15;
		
		try {
//			try contains statement which may generates exception object
			System.out.println("Try block starts here");
			
			String str = "HelloJava";
			System.out.println("character at 10 index : " + str.charAt(10));
			
			System.out.println("Try block here");
		} catch (StringIndexOutOfBoundsException e) {
//			catch block should have an arguments of the exception of the object type
			System.out.println("Inside the catch block");
		}
		
		System.out.println("main() ends here");

	}

}
