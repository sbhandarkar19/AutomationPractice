package javaOperators;

public class SchoolResultCalculator {
//	&& ===> Operator use in this program
//	Requirement ===> 1) marks < 35                 ==> fail
//	                 2) marks >= 35 and marks < 55 ==> pass class
//	                 3) marks >= 55 and marks < 65 ==> second class
//	                 4) marks >= 65 and marks < 75 ==> first class
//	                 5) marks >= 75                ==> distinction

	public static void main(String[] args) {
		int mark = 41;

		if (mark < 35)
			System.out.println("You are failed");

		if (mark >= 35 && mark < 55)
			System.out.println("Pass class");

		if (mark >= 55 && mark < 65)
			System.out.println("Second class");

		if (mark >= 65 && mark < 75)
			System.out.println("First class");

		if (mark >= 75)
			System.out.println("Distinction class");
	}

}
// How to set the format for statements properly
// Right click > Source > Format. ======> Shortcut is Ctrl+Shift+F.