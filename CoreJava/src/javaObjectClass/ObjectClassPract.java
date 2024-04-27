package javaObjectClass;
//Program ==> Three method are indivisible work.
// 1] toString() ==> Returns the object in String format. ex --> fullyqualifiedname@hexadecimalcode.[ toString() method is optional ]
//            If you created an object & forgot which class that object belonged to, then write toString() & java will tell you.
// 2] hashCode() ==> JVM generates a unique number for every object that it creates.it is called "hashCode()" method
//                The hashCode() method returns the hashCode number for the respective Object.
//                Writing hashCode() method is not optional,it has to be written.
// 3] equals(Object obj) ==> Compare two objects for equality.
//            All Three Methods Can Be Override [ toString(), hashCode(), equals(Object obj) ]

class Fruit {
	
}

public class ObjectClassPract {                 // public class ObjectClassPract extends Object{ 

	public static void main(String[] args) {
		Fruit obj = new Fruit();
		System.out.println(obj.toString());     // javaObjectClass.Fruit@626b2d4a
		System.out.println(obj.hashCode());     // 1651191114
		
		ObjectClassPract obj1 = new ObjectClassPract();
		System.out.println(obj1.toString());    // javaObjectClass.ObjectClassPract@5e265ba4
		System.out.println(obj1);               // after compilation ==> System.out.println(obj1.toString())
		System.out.println(obj1.hashCode());    // 1579572132
		
		System.out.println(obj.equals(obj1));   // false
		System.out.println(obj.equals(obj));    // true
	} 
}
// toSting(), hashCode() & equals() can override if required