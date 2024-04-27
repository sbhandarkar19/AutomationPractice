package javaSystemClass;
// Program ==> out, err, get, set method
//           get => check the data.
//           set => set the data.

public class SystemClassPract {

	public static void main(String[] args) {
		System.out.println("Standard output");
		System.err.println("error output");
		
		System.out.println("User current dir : " + System.getProperty("user.dir"));
        System.out.println("User home dir : " + System.getProperty("user.home"));
        System.out.println("OS name : " + System.getProperty("os.name"));
        System.out.println("Java version : " + System.getProperty("java.version"));
        System.out.println("Java vender : " + System.getProperty("java.vendor"));
        
//      System.setProperty("username", "Tester");
        System.out.println("Username : " + System.getProperty("username"));
        
//      in case of getProoerty() if provided key is not present,then it will return null
        
        System.setProperty("user.country", "India");
        System.out.println("User country : " + System.getProperty("user.country"));
        
        System.out.println(System.currentTimeMillis());
//      the difference, measured in milliseconds, between the current time & midnight, January 1, 1970 UTC
	}
}
