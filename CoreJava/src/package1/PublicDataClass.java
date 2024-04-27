package package1;

public class PublicDataClass {
		public int i = 55;                          // public non-static variable
		public static double d = 36.18;             // public static variable
		
		public void publicDisplay() {
			System.out.println("This is non-static public method");
		}
		
		public static void staticPublicDisplay() {
			System.out.println("This is static public method");
		}

		public static void main(String[] args) {
//			We can access public data only within the same package & outside the package.

			
			PublicDataClass obj = new PublicDataClass();
			
			System.out.println(obj.i);                      // access non-static public variable.
			System.out.println(PublicDataClass.d);       // access static public variable.
			
			obj.publicDisplay();                         // access non-static public method.
			PublicDataClass.staticPublicDisplay();    // access static public method.
		}

	}


