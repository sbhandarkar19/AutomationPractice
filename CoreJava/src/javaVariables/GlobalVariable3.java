package javaVariables;

public class GlobalVariable3 {
//	Global variables
//	if requires we may use access specifier/modifier with global variables
//	in case of global variables, if we do not specify the access specifier then its access specifier will be "Default"
	
	public static String bankName = "ABC Bank";
//	public static variable, declared and initialized
	
	protected static String ifscCode = "ABC0000899";
//	protected static variable, declared and initialized
	
	String custName;
//	default non-static variables, declared ==> compiler will assign default value to it
	
	private long accNumber;
//	private non-static variables, declared ==> compiler will assign default value to it
	
	
	public static void main(String[] args) {
//		Local variables
//		we cannot use any access specifier/modifier with local variables
//		we cannot make local variables as static or non-static		
		
		double loanPercentage = 7.5;
		int fdTenure = 2;
		
		System.out.println(GlobalVariable3.bankName);
		System.out.println(GlobalVariable3.ifscCode);
		
		GlobalVariable3 shubham = new GlobalVariable3();
		shubham.custName = "SHUBHAM BHANDARKAR";
		shubham.accNumber = 78954;
		
		GlobalVariable3 rahul = new GlobalVariable3();
		rahul.custName = "RAHUL PATIL"; 
        rahul.accNumber = 56481; 
        
	    GlobalVariable3 dipak = new GlobalVariable3();
	    dipak.custName = "DIPAK RAUT";
	    dipak.accNumber = 35896;
	    
//	    I want to print Shubham account details
	    System.out.println(shubham.custName);
	    System.out.println(shubham.accNumber);
	    
//	    I want to print Rahul account details
	    System.out.println(rahul.custName);
	    System.out.println(rahul.accNumber);
	    
//	    I want to print Dipak account details
	    System.out.println(dipak.custName);
	    System.out.println(dipak.accNumber);
	    	    							
     }

}
