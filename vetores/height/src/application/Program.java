package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many people are register?");
		int n = sc.nextInt();
		
		Person[] people = new Person[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			int age;
			String name;
			double height;
			System.out.println("Person Data " + i);
			System.out.println("Put the height of person " + i);
			height = sc.nextInt();
			System.out.println("Put the age of person")

		}
		
		sc.close();

	}

}
