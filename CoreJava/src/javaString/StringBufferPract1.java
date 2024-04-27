package javaString;
//1] Program ==> StringBuffer 
//IMP ==> 1.thread safe (Synchronized)
//        2. At a time multiple threads can not access this class. this is slower class.

public class StringBufferPract1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println(sb);      // Since toString() is overridden here
		System.out.println("Before change : " + sb.hashCode());
		
//		1] how to append value to this object
		sb.append(" Java ");
		
		System.out.println(sb);    // Hello Java
		System.out.println("After changes : " + sb.hashCode());
		
//      2] how to insert character/sequence of character
		sb.insert(5, "OOPs");
		System.out.println(sb);   // HelloOOPs Java
		
//		3] how to replace character/sequence of character
		sb.replace(5, 9, "******");
		System.out.println(sb);    // Hello***** Java 
		
//		4] how to delete character/sequence of character
		sb.delete(5, 11);
		System.out.println(sb);    // Hello Java
		
//		5] how to reverse the String literal
		sb.reverse();
		System.out.println(sb);    // avaJ olleH
		
//		6] how to check StringBuffer capacity
		System.out.println("StringBuffer capacity : " + sb.capacity());  // StringBuffer capacity : 21
		
//		7] lets check the default capacity of string buffer
		StringBuffer sb1 = new StringBuffer();
		System.out.println("Default capacity of String Buffer : " + sb1.capacity());  // Default capacity of String Buffer : 16

//		StringBuffer capacity calculation
//		New capacity = (OldCapacity * 2) ==> (21/2)+2 = 12.5
	}
}
