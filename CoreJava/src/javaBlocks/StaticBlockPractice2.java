package javaBlocks;

public class StaticBlockPractice2 {
//	Multiple Static Block 
//	Before static block execution, then After main method execution.
	
	static {
		System.out.println("This is first static block");
	}

	public static void main(String[] args) {
		System.out.println("Main method starts here");
	}
	
	static {
		System.out.println("This is second static block");
	}

}
