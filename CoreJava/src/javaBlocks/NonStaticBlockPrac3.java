package javaBlocks;

public class NonStaticBlockPrac3 {
//	Multiple Non-Static Block Program
	
	{
		System.out.println("This is first non-static block");
	}
	
	{
		System.out.println("This is second non-static block");
	}
	
	NonStaticBlockPrac3(){
		System.out.println("This is constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main() starts here");
		
		NonStaticBlockPrac3 obj = new NonStaticBlockPrac3();
	}
	
	{
		System.out.println("This is third non-static block");
	}

}
