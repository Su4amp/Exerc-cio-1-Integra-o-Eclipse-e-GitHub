import java.util.Scanner;

public class NovaClasse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int num1 = s.nextInt();
		System.out.println("Digite outro n�mero: ");
		int num2 = s.nextInt();
		int res = num1 + num2;
		System.out.println("O resultado da soma dos n�meros �: " + res);
		

	}

}
