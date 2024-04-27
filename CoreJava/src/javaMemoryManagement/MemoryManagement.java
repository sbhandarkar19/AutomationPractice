package javaMemoryManagement;

public class MemoryManagement {
//	this program as same is book day27 figure
//	this program run as background the memory
	
	int a;            // global non-static 
	double d=20.44;   // global non-static
	
	static float f;              // global static
	static boolean flag = true;  // global static
	
	public void nonStaticMethod() {  // non-static method
		
	}
	
	protected static void staticMethod() {   // static method
		
	}
	

	public static void main(String[] args) {
		MemoryManagement obj = new MemoryManagement();
		
		MemoryManagement obj1 = new MemoryManagement();
		
		obj.a =15;
		
		obj1.d = 50.25;
			
	}

}
