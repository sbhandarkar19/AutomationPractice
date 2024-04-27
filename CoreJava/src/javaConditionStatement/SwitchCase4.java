package javaConditionStatement;

public class SwitchCase4 {
//	this non-static method including (String) Parameter
	
	public void printStateCapital(String state) {
		switch (state) {
		case "MH":
			System.out.println("Mumbai");
			break;
		case "GJ":
			System.out.println("Gandhinagar");
			break;
		case "KK":
			System.out.println("Bangalore");
			break;
		case "TS":
			System.out.println("Hyderbad");
			break;
		}
	}
	

	public static void main(String[] args) {
//		global varible are include non-static method the call for ( Create Object) from local variable
		
		SwitchCase4 pen = new SwitchCase4();
		
		pen.printStateCapital("MH");
		pen.printStateCapital("GJ");
		pen.printStateCapital("KK");
		pen.printStateCapital("TS");
		
	}

}
