package javaExceptionHandling;
// Program ==> How to declare Exception.
//  IMP ==> 1. You can declare exception by using throws keyword in the signature of the method.
//          2. This can be told by using throws keyword in main method or any method. which exception will that specific method throws?
//          3. Multiple exception can be declared through the throws keyword. Just have to write it out comma separated. ex --> ( , , , )

public class ThrowKeyword3 {
	
//	In some case we can declare that the method can produce exception, so that calling method will handle it as its requirement
//	to declare the exception throws keyword can be used, using throws keyword we can declare multiple exceptions
//	throws will never handle exception, it only specifies that what exception a method produce.
	
	public void division (int a, int b) throws ArithmeticException, StringIndexOutOfBoundsException {
		System.out.println("division method starts here");
		
		System.out.println("Division : " + ( a / b ));
		
		String operation = "division";
		System.out.println(operation.charAt(12));
		
		System.out.println("division method ends here");
	}

	public static void main(String[] args) {
		System.out.println("main() method starts here");
		
		String str = "CalculatorOperation";
		System.out.println(str);
		
		ThrowKeyword3 obj = new ThrowKeyword3();
		
		try {
			obj.division(15, 0);
		} catch (ArithmeticException e) {
			
		} catch (StringIndexOutOfBoundsException e) {
			
		}

		System.out.println("main() ends here");
	}

}
