package javaScannerClass;

import java.util.Scanner;

// Program ==> 1] Will talk about primitive data types.
//             2] Variable is declared & initialized data will be provided at run time (console) to the user through. 
//  Scanner in = new Scanner(Syatem.in)

public class ScannerClassPract {
	
	public void printMonth(int monthNumber) {
		switch (monthNumber) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:	
			System.out.println("Feb");
			break;                    // break the execution of switch case and control will go out of switch case body
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("Jul");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sept");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		default:
			System.err.println("Please enter the valid number");  // A] println (err) through print the RED color. B] println (out) through print the BLUE color.
			break;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);             // process 3 byte data input the scanner class use & scanner class has to be imported by mouse over the scanner.
		ScannerClassPract obj = new ScannerClassPract();
//		scanner class will give InputMismatchException if proper data is not provided/entered
		
		byte b;                                           // process 1 variable only declare
		System.out.println("Enter byte variable value");  // process 2 console user massage run time data provide
		b = scn.nextByte();                               // process 4 Whatever data we enter here,that method will return it. then return data save it in this variable.                  
        System.out.println("You have entered byte variable value as : " + b);    // process 5 The value of the (byte) is printed here. 
        
        int i;
        System.out.println("Enter int variable value");
        i = scn.nextInt();
		System.out.println("You have entered int variable value as : " + i);
		
		int monthNumber;
		System.out.println("Enter the month number to know the Month");
		monthNumber = scn.nextInt();
		obj.printMonth(monthNumber);
		
		double d;
		System.out.println("Enter double variable value");
		d = scn.nextDouble();
		System.out.println("You have entered double variable value as : " + d);
		
//		There is no need to declare variable every time,this can be done by speaking to the user also.
//		boolean flag;
		System.out.println("Enter boolean variable value");
		boolean flag = scn.nextBoolean();                  // variable declare & initialized at the same time.    
		System.out.println("You have enterd boolean variable value as : " + flag);
		
		System.out.println("Enter char variable value");
		char ch = scn.next().charAt(0);
		System.out.println("You have entered char variable value as : " + ch);
		
		System.out.println("Enter String variable value");
		String str = scn.next();
		System.out.println("You have enetered String variable value : " + str);
	}

}
