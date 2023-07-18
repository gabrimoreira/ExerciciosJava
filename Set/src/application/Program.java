package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.User;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<User> a = new HashSet<>();

		Set<User> b = new HashSet<>();

		Set<User> c = new HashSet<>();

		System.out.println("Hom many users for course A?");
		int tamA = sc.nextInt();

		for (int i = 0; i < tamA; i++) {
			Integer codeA = sc.nextInt();
			a.add(new User(codeA));
		}

		System.out.println("Hom many users for course B?");
		int tamB = sc.nextInt();

		for (int i = 0; i < tamB; i++) {
			Integer codeB = sc.nextInt();
			a.add(new User(codeB));
		}
		System.out.println("Hom many users for course C?");
		int tamC = sc.nextInt();

		for (int i = 0; i < tamC; i++) {
			Integer codeC = sc.nextInt();
			a.add(new User(codeC));
		}

		a.addAll(b);
		a.addAll(c);

		System.out.println("Total User: " + a.size());
	}

}
