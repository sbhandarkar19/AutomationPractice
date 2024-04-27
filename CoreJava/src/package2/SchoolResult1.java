package package2;
//          use 3rd way ==> [fully qualified name.]
//Program ==> I want to used Calculator class [without import statement through]
//            Will access the Calculator class of package1 from package2 through [fully qualified name.]

public class SchoolResult1 {

	public static void main(String[] args) {
//		without using import statement we can use fully qualified name of the class to use its data.
//		You will have to write the package name & class name by creating an object inside the main method.
		package1.Calculator obj = new package1.Calculator();  // [fully qualified name ] through call Calculator class in package1.
		
		int totalMark = obj.totalMarks(83, 76, 91);          // Will access non-static data of calculator class.
		System.out.println("Total marks : " + totalMark);
		
		double calculateAverage = package1.Calculator.calculateAverage(totalMark, 3.0); // Will access static data of calculator class.
		System.out.println("Average marks : " + calculateAverage);
	}
}
