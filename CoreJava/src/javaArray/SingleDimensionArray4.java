package javaArray;

public class SingleDimensionArray4 {

	public static void main(String[] args) {
		
//			how to declare, instantiate and initialize array variables in single line statement

			char[] arrCh = { 'a', 'b', 'c', 'd', 'e' };

			int arrLength = arrCh.length;

			System.out.println("**** print array using for-loop ****");
			for (int i = 0; i < arrLength; i++) {
				System.out.println(arrCh[i]);
			}

			for (int i = 0; i < arrLength; i++) {
				System.out.print(arrCh[i] + " ");
			}
			System.out.println();

			for (char j : arrCh) {
				System.out.println(j);
			}

//			how to print any specific index value
			System.out.println(arrCh[2]);
		}
   }


