package javaConstructor;

public class Constructor1 {
//	in this class default constructor is present which is created by compiler
	
	int i = 17;
	
	public void nonStaticMethod() {
		System.out.println("Non ststic method");
	}

	public static void main(String[] args) {
		
		Constructor1 obj = new Constructor1();
						
		Constructor1 obj1 = new Constructor1();
		
		System.out.println(obj.i);
		
		System.out.println(obj1.i);
		
		

	}

}
