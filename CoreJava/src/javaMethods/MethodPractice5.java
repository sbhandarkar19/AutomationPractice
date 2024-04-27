package javaMethods;

public class MethodPractice5 {
//	in this method added new twist this program.
//	added this method (return the result) this program.
	
	public static int additionOfNum(int a, int b) {
		int add = a + b;
//		System.out.println("Addition is : " + add);
		return add;
	}
	
	public double subtractionOfNum(double a, double b) {
		double sub = a - b;
//		System.out.println("Subtraction is : " + sub);
		return sub;
	}
	
	public void multiplicationOfNum(int a, int b) {
		System.out.println("Multiplication is : " + (a * b));
		
	}

	public static void main(String[] args) {
	   int addition = MethodPractice5.additionOfNum(16, 10);
//		Since we have Stored the result in (int Addition) variable line no 20,we can use it in future
		System.out.println("Addition is : " + addition);
		
		MethodPractice5 obj = new MethodPractice5();
		System.out.println("Subtraction is : " + obj.subtractionOfNum(150.8, 50.4));
//		Since subtractionOfNum method returns some value,therefore we can call it from (println) method
//		as we don't want to use the returns some value of subtraction method and we just want to see the output
//		that's why we are calling it from main method.
		
//	 
//	    System.out.println(obj.multiplicationOfNum(2, 4));
//		As multiplicationOfNum method does not return anything therefore we cannot call it from println method.
		
	}

}
