package javaBlocks;

public class NonStaticBlockPrac1 {
//	2] Non-Static Block
//	Non-static block execution step ==> 1] main method ==> 2] Non-static block ==> 3] Constructor
//	non-static block is executed at time the object creation & before constructor execution.
	
//	non-static block
	{
		System.out.println("This is non-static block");
	}
	
//	Constructor
	NonStaticBlockPrac1(){
		System.out.println("Tis is constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method starts here");
		
		NonStaticBlockPrac1 obj = new NonStaticBlockPrac1();
	}

}
