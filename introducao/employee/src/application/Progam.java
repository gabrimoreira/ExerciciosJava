package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salary;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Salary salary;
		salary = new Salary();
		double increase;
		
		System.out.println("Put the employee data");
		System.out.print("Name: ");
		salary.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		salary.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		salary.tax = sc.nextDouble();
		
		System.out.println("Employee: " + salary.toString());
		System.out.println("Which percentage to increase salary? ");
		increase = sc.nextDouble();
		salary.increaseSalary(increase);
		System.out.println("Updated data: " + salary.toString());
		
		sc.close();
	}

}
