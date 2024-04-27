package javaMethods;

public class MethodPractice4 {
//	How to call or access the method this program.
	
	public static void additionOfNum(int a, int b) {
		System.out.println("Addition is : " + (a + b));
	}
	
	public void subtractionOfNum(double a, double b) {
		System.out.println("Subtraction is : " + (a -b));
	}
	

	public static void main(String[] args) {
		MethodPractice4.additionOfNum(12, 16);                   // Addition Method is static then (class name) through call.
		
//		Creating object of current class
		MethodPractice4 obj = new MethodPractice4();            // Subtraction Method is non-static the (object) through call
		obj.subtractionOfNum(30, 14.5);
		
	}

}
