package package1;

public class AccessPrivateData {

	public static void main(String[] args) {
		PrivateDataClass obj = new PrivateDataClass();
//		We cannot access private data of another class
		
//		System.out.println(obj.i);              // The field PrivateDataClass.i is not visible
//		System.out.println(PrivateDataClass.d); // The field PrivateDataClass.d is not visible
//		
//		obj.privateDisplay();                     //  The method privateDisplay() from the type PrivateDataClass is not visible
//		PrivateDataClass.staticPrivateDisplay();  // The method staticPrivateDisplay() from the type PrivateDataClass is not visible
		 
	}
}
