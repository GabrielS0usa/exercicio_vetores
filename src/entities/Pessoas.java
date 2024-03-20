package entities;

public class Pessoas {

	private String nome;
	private int idade;
	private double altura;

	public Pessoas(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double alturaMedia(Pessoas[] vetor) {
		double sum = 0;
		for (int i = 0; i < vetor.length; i++) {
			sum += vetor[i].getAltura();
		}
		sum = sum / vetor.length;
		return sum;
	}

	public double idadeMedia(Pessoas[] vetor) {
		double sum = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				sum++;
			}
		}
		sum = (sum / vetor.length) * 100.0;
		return sum;
	}

	public void pessoasNomeMenor16(Pessoas[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}
	}

}
