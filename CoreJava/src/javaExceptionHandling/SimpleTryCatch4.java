package javaExceptionHandling;
// Program ==> A single try block can have multiple catch block
// IMP ==> Whenever I write multiple catch block, they will be written in sequential order. Smaller to Higher like this.
//  EX ==> (NullPointerException, RuntimeException, Exception, Throwable, Object) 

public class SimpleTryCatch4 {

	public static void main(String[] args) {
//		a single try block can have multiple catch blocks, java will check with catch block in sequential order
		System.out.println("main() starts here");
		String str = "Java";
		String str1 = null;
		try {
			System.out.println("try block starts here");
			System.out.println("Character at 5 index in str : " + str.charAt(5));  // StringIndexOutOfBoundsException
			System.out.println("Length of str1 : " + str1.length()); // NullPointerException
			
			System.out.println("try block ends here");
			
		} catch (StringIndexOutOfBoundsException e) {
//			this catch block has the responsibility to catch StringIndexOutOfBoundsException object
			
		} catch (NullPointerException e) {
//			this catch block has the responsibility to catch NullPointerException
			
		} catch (RuntimeException e) {
//			this catch block has the responsibility to catch Runtime Exception
			
		} catch (Exception e) {
//			this catch block has the responsibility to catch any runtime or compile exception
			
		}
		
//		in case of multiple catch block, catch blocks should be written in sequential manner
//		i.e lower exception catch block should be written first, & higher exception catch block should be written later
//		if this is not followed then it will give compile time error as 'Unreachable catch block'
		
		System.out.println("main() ends here");

	}

}
