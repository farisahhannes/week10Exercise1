import java.util.Scanner;

public class Bahagi {
	public static void main (String [] a) {
		int baki;

		try {
			baki = 10;
				if (baki<20)
				{
					throw new IllegalArgumentException("Baki kurang RM20");
				}
			} catch (IllegalArgumentException b) {
				System.out.println("this catch: " + b);
		} catch (Exception b) {
			System.out.println("This catch: " + b);
		} finally {
			System.out.println("Finally");
		}
	}
}
// 	Scanner input = new Scanner(System.in);
// 	int no1,no2,hasil;
// 	no1 = no2 = hasil = 0;


// 	try {	
// 		System.out.println("No 1 : ");
// 	no1 = input.nextInt();
// 	System.out.println("No 2 : ");
// 	no2 = input.nextInt();
// 	hasil = no1/no2;
	
	
// 	} catch (InputMismatchException | ArithmeticException e ) {
// 		System.out.println("Catch here : " + e);

// 	}

// 	finally {
// 		System.out.println("Dalam Finally");
// 	}

// 	System.out.println("Hasil bahagi : " + no1 + " / " + no2 + " = " + hasil);


// 	int [] nombor = {1,2,3};
// 	try {
// 		System.out.println(nombor[3]);
// 	} catch (ArrayIndexOutOfBoundsException e) {
// 		System.out.println("Catch here : " + e);
// 	}


// 	System.out.println("After catch ");
// 	System.out.println("After catch ");
// 	System.out.println("After catch ");
// 	System.out.println("After catch ");
// 	//hasil = no1/no2;
	


// 	}
// }