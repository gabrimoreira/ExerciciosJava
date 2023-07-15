package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n): ");
		char temp = sc.next().charAt(0);
		
		Account account;
		
		if(temp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			
			account = new Account(number,holder, deposit);
		}
		else {
			account = new Account(number, holder);
		}
		System.out.println("Account data: " );
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		
		System.out.println("Account data: " );
		System.out.println(account);
		
		System.out.print("Enter a withdraw valeu: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("Account data: " );
		System.out.println(account);
		
		sc.close();
	}

}
