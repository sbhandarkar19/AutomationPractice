package javaBlocks;

public class StaticBlockPractice {
//	1] Static Block
//	Static block execution ==> 1] Static block ==> 2] Main method.
//	A variable defined within a BLOCK , METHOD & CONSTRUCTOR is called " Local Variable".
//	Static block is executed before the execution of main method.
//	Requirement==> How is its execution done by adding static blocks. this program
	
	static {  // static block will be executed before main method()
		System.out.println("This is static block");
	}

	public static void main(String[] args) {
		System.out.println("Main method starts here");
	}

}
