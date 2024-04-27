package thisKeyword;

public class ThisStatement2 {
//  Requirement ==> I want to execute char, int & double, and then zero parameterized constructor
	
	ThisStatement2() {
		this(4, 3.14);
		System.out.println("Zero parameterized constructor");
	}
	
	ThisStatement2(int a, double d) {
		this('a');
		System.out.println("Int & double parameterized constructor");
	}
	
	ThisStatement2(char ch) {
		System.out.println("Char parameterized constructor");
	}
	
	
	public static void main(String[] args) {
		
		ThisStatement2 obj = new ThisStatement2();  // calling zero parameterized constructor
	}

}
