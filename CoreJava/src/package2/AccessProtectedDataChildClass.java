package package2;

import package1.ProtectedDataClass;

public class AccessProtectedDataChildClass extends ProtectedDataClass {
	
	public static void main(String[] args) {
//		We can access the protected data of outside the package through inheritance [child/sub class].
		
		AccessProtectedDataChildClass obj = new AccessProtectedDataChildClass();
		
		System.out.println(obj.i);              
		System.out.println(AccessProtectedDataChildClass.d); 
		
		obj.protectedDisplay();                     
		AccessProtectedDataChildClass.staticProtectedDisplay();  

	}

}
