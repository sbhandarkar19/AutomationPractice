package thisKeyword;

public class ThisKeyword1 { 
//	This keyword refer to the class current object.
//	Program ==> If we have same identifier(name) of local & global variable then to differentiate between them we can use [ this keyword].
//	this keyword can also be used to access non-static member of the same object.
	
	int populationArea1 = 1250;       // global variable
	
	public void displayData() {       // create non-static method
		int populationArea1 = 2880;   // local variable
		
		System.out.println("Local variable : " + populationArea1);
		System.out.println("Global variable : " + this.populationArea1);
	}

	public static void main(String[] args) {
		ThisKeyword1 obj = new ThisKeyword1();
	    obj.displayData();

	}

}
