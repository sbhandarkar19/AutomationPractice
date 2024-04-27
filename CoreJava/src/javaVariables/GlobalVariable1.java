package javaVariables;

public class GlobalVariable1 {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d1;
	char ch;
	boolean flag;
	String str;
//	above variable are non-static (instance or object variable) global variables
//	above variables are only declared & they are not initialized
//	If we don't initialize global variable,then compiler will initialize them with their respective default value
	
	
	public static void main(String[] args) {
		double d = 3.14;        //variable d is local variable
		
//		lets create the object of current class
//		syntax object--->class_name object_name = new class_name();
		
		GlobalVariable1 pen = new GlobalVariable1();
		
		System.out.println(pen.b);
		System.out.println(pen.s);
		System.out.println(pen.i);
		System.out.println(pen.l);
		System.out.println(pen.f);
		System.out.println(pen.d1);
		System.out.println(pen.ch);
		System.out.println(pen.flag);
		System.out.println(pen.str);
	}

}
