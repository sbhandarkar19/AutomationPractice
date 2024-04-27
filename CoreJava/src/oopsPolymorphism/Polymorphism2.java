package oopsPolymorphism;
// Program ==> Method overloading in this program.Because void method in calling-calling name is same. but is not visible.

class MobilePhone {
	void calling(int mobileNum) {
		System.out.println("Calling... " + mobileNum);
	}
}

class OnePlus extends MobilePhone {
	
//	void calling(int mobileNum) {
//		System.out.println("Calling... " + mobileNum);
//	}
	
	void calling(int mobileNum, int countryCode) {
		System.out.println("Calling... " + countryCode + "-" + mobileNum);
	}
}
public class Polymorphism2 {

	public static void main(String[] args) {
		OnePlus obj = new OnePlus();
		obj.calling(888884777);
		obj.calling(12345678, 91);
		
		Polymorphism2.main(2);
	}
	
	public static void main(int a) {          //  main method is overload 
		System.out.println("This is int parameterized main()");
	}
}
// Q. Can we overload the main() : Yes, we can overload the main(),
//                                 but java program will always execute main() having parameter as (String[] args).
// Q. Can we overload static method : Yes.
// Q. Can we overload private method : Yes.
// Q. Can we overload final method : Yes.
// We can change the access & non-access of the method while method overloading.