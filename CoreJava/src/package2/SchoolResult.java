package package2;
// Program ==> Calling package1 from package2.
//             use 1st way ==> [import package.*;] all data import
//             use 2nd way ==> [import package.classname;] only class data import

// IMP ==> Import from outside the class to make it accessible to other packages

import package1.*;                       // it will import all the data from package1
// import oopsEncapsulation.*;           // it will import all the data from oopsEncapsulation package
import oopsEncapsulation.Encapsulation;  // it will import all the data from Encapsulation Class only

public class SchoolResult {

	public static void main(String[] args) {
		Calculator mohit = new Calculator();
		Mobile obj = new Mobile();
		
		Encapsulation encap = new Encapsulation();		
//		Encapsulation1 encap1 = new Encapsulation1();  // it will give error since we have not imported this class. 

		
//		accessing non-static data of Calculator class through its Object
		int totalMark = mohit.totalMarks(75, 60, 70);
		System.out.println("Total marks : " + totalMark);
		
//		accessing static data of thr Calculator class through its name
		double calculateAverage = Calculator.calculateAverage(totalMark, 3.0);
		System.out.println("Average marks : " + calculateAverage);
	}

}
