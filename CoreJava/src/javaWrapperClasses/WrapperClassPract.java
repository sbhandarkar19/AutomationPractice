package javaWrapperClasses;
// IMP : 1. Automatic Conversion is [Primitive data to Object] is called "autoboxing".
//       2. Automatic Conversion is [Object to Primitive data] is called "auto-unboxing".

public class WrapperClassPract {

	public static void main(String[] args) {
//		[primitive data <--> object]      can be done with help wrapper classes
		
		byte b = 72;                   // primitive data     {primitive data to object}
		Byte bObj = b;                 // implicit auto boxing (object)
		System.out.println("byte data : " + bObj); 
		
		int i = 523;                    // primitive data
		Integer iObj = new Integer(i);  // explicit boxing (object)    // this technique has been deprecated since java9
		System.out.println("int data : " + i);
		
		Boolean fObj = false;           // object    {object to primitive data}
		boolean flag = fObj;            // implicit auto unboxing (primitive data)
		System.out.println("Boolean data : " + flag);
		
		Double dObj = 3.14;              // object
		double d = dObj.doubleValue();   // explicit unboxing (primitive data)
		System.out.println("double data : " + d);
	}
}
