package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNegativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Quantos números você vai digitar: ");
		n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("NÚMEROS NEGATIVOS");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}

}
