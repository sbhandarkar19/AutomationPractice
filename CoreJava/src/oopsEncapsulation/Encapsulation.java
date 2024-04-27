package oopsEncapsulation;
// 1] Encapsulation process of wrapping code & data together info a single unite.
// 2] The meaning of Encapsulation, is to make sure that " Sensitive " data is hidden from users.
//     a] To make read only class --> make variable as private & provide only "getter (get) method".
//     b] To make write only class --> make variable as private & provide only "setter (set) method".
//     c] To make read & write class --> make variable as private & provide "getter (get) & setter (set) method".

class Bank {
//	pruvate variables and method can only accessed within the same class only
	private int accNum = 123;
	private double accBalance = 487.45;
	private String name = "Rahul";
	static String bankName = "ABC Bank";
	
//	always ensure that getter & setter method should be public
	public int getAccNum() {            // create getter method
		return accNum;
	}
	
	public double getAccBalance() {
		return accBalance;
	}
	
	public String getName() {         // create setter method
		return name;
	}
	
	public void setAccNum(int accNum) {     // (int accNum) is inside the method then local variable
		this.accNum = accNum;               // (this.accNum --> global variable & accNum --> local variable) same name is differentiate for ( this keyword).
	}
	
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Bank obj = new Bank();
//		System.out.println(obj.accNum);    // The field Bank.accNum is not visible
//		System.out.println(obj.accBalance);
//		System.out.println(obj.name);
		System.out.println(obj.bankName);
		
		System.out.println(obj.getAccNum());
		System.out.println(obj.getAccBalance());
		System.out.println(obj.getName());
		
		obj.setAccNum(987654);
		obj.setAccBalance(65447.54);
		obj.setName("Rahul Patil");
		
		System.out.println("****************");
		System.out.println(obj.getAccNum());
		System.out.println(obj.getAccBalance());
		System.out.println(obj.getName());
	}

}
