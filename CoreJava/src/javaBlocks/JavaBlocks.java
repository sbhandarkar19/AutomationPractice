package javaBlocks;

public class JavaBlocks {
//	Combine Program--> Static block, Non-Static block & Default Constructor Program.
//	Execution Step ==> 1] Static Block ==> 2] Main method ==> 3]  Non-Static Block 4] Constructor(Default) 
	
	{
		System.out.println("This is first non-static block");
	}
	
	{
		System.out.println("This is second non-static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method start here");
		
		JavaBlocks obj = new JavaBlocks();
	}
	
	{
		System.out.println("This is third non- static block");
	}
	
	static {
		System.out.println("This is first static block");
	}
	
	static {
		System.out.println("This is second static block");
	}
}
