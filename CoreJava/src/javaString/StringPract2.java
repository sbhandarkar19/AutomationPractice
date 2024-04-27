package javaString;

public class StringPract2 {

	public static void main(String[] args) {
		String s = "Apple";
		String s1 = "Apple";
		String s2 = "Kiwi";
		String s3 = "Orange";
		String s4 = new String("Apple");
		String s5 = new String("Mango");
		String s6 = "Mango";
	
//		1] comparing using equal() --> equal() is overridden in string class, and it compares based on literal(value)
		System.out.println("s.equals(s4) = "+ s.equals(s4));   // true
		System.out.println("s5.equals(s6) = "+ s5.equals(s6)); // true
		System.out.println("s2.equals(s3) = "+ s2.equals(s3)); // false
		
//		2] comparing using == --> == will compare based on memory location or address of the object
		System.out.println("s == s1 = "+ (s == s1));   // true
		System.out.println("s1 == s4 = "+ (s1 == s4)); // false
		System.out.println("s5 == s6 = "+ (s5 == s6)); // false
		
//		3] toString() will return the String literal of the string object as it is overridden in String class
		System.out.println(s); // after Compilation ==> System.out.println(s.toString());
		System.out.println(s4.toString());
		System.out.println(s3.toString());
		System.out.println(s2);
//		to.String() cannot mandatory write 
		
//		4] hashcode() => for every object JVM assign hashcode() based on memory, & hashcode() will be used to get the hasgcode(),
//		                 but is string class hashcode() is overridden.
		s.hashCode();  // s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1] is used to calculate hashcode()
//		In String class hashcode calculation depends on String literals
		
		System.out.println(s.hashCode());
		System.out.println(s4.hashCode());
	}
}
