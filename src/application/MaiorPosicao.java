package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros vai digitar: ");
		int n = sc.nextInt();

		double[] num = new double[n];

		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite um número: ");
			num[i] = sc.nextDouble();
		}

		int posi = 0;
		double maior = num[0];

		for (int i = 0; i < num.length; i++) {
			
			if (maior < num[i]) {
					maior = num[i];
					posi = i + 1;
			}

		}

		System.out.printf("Maior valor = %.1f\n", maior);
		System.out.println("Maior valor = " + posi);

		sc.close();
	}

}
