package javaBlocks;

public class NonStaticBlockPrac2 {
//	non-static block can be used to initialize the non-static variable
	
	int a;
	public boolean flag;
	String str;
	
	{
		System.out.println("This is non-static block");
		a = 15;
		flag = false;
		str = "Java-selenium";
	}
	
	NonStaticBlockPrac2(){
		System.out.println("This is constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method stars here");
		
		NonStaticBlockPrac2 obj = new NonStaticBlockPrac2();
		System.out.println(obj.a);
		System.out.println(obj.flag);
		System.out.println(obj.str);
	}

}
