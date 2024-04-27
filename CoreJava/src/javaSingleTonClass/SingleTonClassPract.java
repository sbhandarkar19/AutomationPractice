package javaSingleTonClass;
// Program ==> Singleton Class
// To Create Singleton class refer below points:
//   1. Create class constructor class as private
//   2. Create static instance of current class
//   3. Create (public)static method which should returns object of current class.

class GoldenMobile {
	double gold = 3.5;
	double size = 6.2;
	
	private GoldenMobile() {
//		private constructor will prevent object creation from outside the class.
//		as constructor is private, it cannot be accessed from outside this class
//		Object of this class cannot be created from outside the class
	}
	
	static GoldenMobile mobile = new GoldenMobile();
//	here we are giving early instantiation
	
	public static GoldenMobile getGoldenMobile() {
//		GoldenMobile mobile = new GoldenMobile();
//		here we are giving lazy instantiation
		return mobile;
	}
}

public class SingleTonClassPract {

	public static void main(String[] args) {
//		GoldenMobile mobile1 = new GoldenMobile1();  // since constructor is private we cannot access it
		                                             // as constructor is private we cannot create object here
		
		GoldenMobile mobile1 = GoldenMobile.getGoldenMobile();
	}
}
