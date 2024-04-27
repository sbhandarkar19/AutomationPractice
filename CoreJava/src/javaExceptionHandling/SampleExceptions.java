package javaExceptionHandling;
// Wherever the Exception appears, Java terminates the program there. Does not print further.
//  Exception ==> Exception can protect programs from being crushed.
//  Error ==> We will not avoid being crushed by error, we will let it crush us. 


public class SampleExceptions {

	public static void main(String[] args) {
		System.out.println("main() starts here");
//		1. Abnormal statement
//		int i = 15;
//		int j = i/0;          // ArithmeticException, as exception occurs here program execution will stop here itself.
		
//		2. Abnormal statement
//		int[] arrInt = new int[3];
//		arrInt[3] = 103;      // ArrayIndexOutOfBoundsException
		
//		3. Abnormal statement
		String str = "HelloJava";  // 8 is the last index
		System.out.println("character at index 10 : " + str.charAt(10));	//  StringIndexOutOfBoundsException	
				
        System.out.println("main() ends here");
	}
}
