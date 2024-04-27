package javaConditionStatement;

public class SwitchCase1 {
//	Print the calendar month based on month number

	public static void main(String[] args) {
		int monthNumber = 11;
		
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

}
