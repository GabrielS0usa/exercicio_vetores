package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class ProgramAlturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		sc.nextLine();
		Pessoas[] vect = new Pessoas[n];
		Pessoas pessoa = null;

		for (int i = 0; i < n; i++) {
			String nome;
			int idade = 0;
			double altura = 0;

			System.out.println(String.format("Dados da %d° pessoa: ", i + 1));
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			System.out.println();
			sc.nextLine();

			pessoa = new Pessoas(nome, idade, altura);
			vect[i] = pessoa;
		}

		System.out.printf("Altura média: %.2f\n", pessoa.alturaMedia(vect));
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% \n", pessoa.idadeMedia(vect));
		pessoa.pessoasNomeMenor16(vect);

		sc.close();
	}

}
