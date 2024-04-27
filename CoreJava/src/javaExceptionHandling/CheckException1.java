package javaExceptionHandling;
// Program ==> Are going to include check exception.[Basically when will you check FileNotFoundException]
//           If there is any checkedException in the program, then we must handle/catch it first, without this we cannot run program

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckException1 {

	public static void main(String[] args) {
		System.out.println("main() starts here");
		
		try {
			FileInputStream obj = new FileInputStream("F:/acceleration class note/project");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("main() ends here");

	}

}
// If there is any checkedException in the program, then we must handle/catch it first, without this we cannot run program