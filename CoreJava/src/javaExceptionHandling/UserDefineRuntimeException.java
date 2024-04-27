package javaExceptionHandling;
// Program ==> UserDefineRuntimeException [Unchecked]
// A public constructor has to be created for the description. [UserDefineCheckedException] & [UserDefineUncheckedException].
// Will create a variable & make it represent the status of the card. It will represent whether any product is added to the card or not.  

class EmptyCartException extends RuntimeException {
//	As we EmptyCartException class inherit RuntimeException class then it become Run time exception
}

class EmptyCartExceptionWithDescription extends RuntimeException {
//	As we EmptyCartException class inherit RuntimeException class then it become Run time exception
	public EmptyCartExceptionWithDescription() {
		System.out.println("As cart is empty, you cannot proceed for chechkout");
	}
}

class EmptyCartExceptionWithDescription1 extends RuntimeException {
//	As we EmptyCartException class inherit RuntimeException class then it become Run time exception
	public EmptyCartExceptionWithDescription1(String s) {
//		System.out.println("As cart is empty, you cannot proceed for chechkout");
		super(s);
	}
}

public class UserDefineRuntimeException {

	public static void main(String[] args) {
		System.out.println("main() starts here");
		int numberProductsInCart = 0;
		
		if (numberProductsInCart == 0) {
//			throw new EmptyCartException();
//			throw new EmptyCartExceptionWithDescription();
			throw new EmptyCartExceptionWithDescription1("As cart is empty, you cannot proceed for chechkout");
		}
		
		System.out.println("main() ends here");

	}

}
