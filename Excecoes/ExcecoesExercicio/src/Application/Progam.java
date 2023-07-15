package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {

		method2();
		System.out.println("End of program!");
		
	
	}
	public static void method1() {
		System.out.println("**METHOD 1**");
	}
	public static void method2() {
	
	Scanner sc = new Scanner(System.in);
	try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid postion!");
	}
	catch(InputMismatchException e) {
		System.out.println("Input error");
	}

	sc.close();
}	
}
