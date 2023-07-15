import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * String nome = "Maria"; int l = 33; double x = 10.311231;
		 * System.out.println("Olá mundo"); System.out.println("Bom dio");
		 * System.out.println(l); System.out.printf("%.2f\n", x); //Para trocar o
		 * separador de decimaais do Brasil "," para o "." Locale.setDefault(Locale.US);
		 * System.out.printf("%.2f\n", x); System.out.println("Saldo de " + x +
		 * " Reais"); //Ou System.out.printf("Saldo de %.2f Reais da %s", x, nome);
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		x = sc.next();
		//sc.nextLine para lê até o \n;
		//limpeza de buff nextLine();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
	}

}
