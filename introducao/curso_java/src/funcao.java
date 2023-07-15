import java.util.Scanner;

public class funcao {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	System.out.println("O maior valor: " + max(a,b,c));
	sc.close();
	}
	public static int max(int a, int b, int c) {
		if(a > b && a > c) {
			return a;
		}
		else if(b > c) {
			return b;
		}
		return c;
	}

}
