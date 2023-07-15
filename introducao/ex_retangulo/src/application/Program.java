package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo x;
		x = new Retangulo();
		System.out.println("Put the retangle data: ");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		System.out.println("MEASAURES: " +  x);
		
		sc.close();
	}
}
