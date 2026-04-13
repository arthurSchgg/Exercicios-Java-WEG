package Ex10;

import java.util.Scanner;

public class Aluno {
	Scanner sc = new Scanner(System.in);

	private String nome;
	private int idade;
	private double nota;
	private double novaNota;
	private char escolha;

	public Aluno() {
		this.nome = "";
		this.idade = 0;
		this.nota = 0.0;
	}

	public Aluno(String nome, int idade, Double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}

	public char atualizarNota() {
		System.out.print("\nVocê deseja atualizar a nota do seu aluno? (S/N)");
		escolha = Character.toUpperCase(sc.next().charAt(0));
		if (escolha == 'S') {
			System.out.print("\nEscreva uma nota pra atualizar: ");
			novaNota = sc.nextDouble();
		} else if (escolha == 'N') {
			System.out.println("Encerrando..");
		}
		return escolha;
	}

	public void exibirDetalhes() {
		if (escolha == 'S') {
			System.out.println("=====================================");
			System.out.println("              Aluno 1                ");
			System.out.println("=====================================");
			System.out.println("Nome do aluno: " + getNome());
			System.out.println("Idade do aluno: " + getIdade());
			System.out.println("Nota do aluno: " + getNovaNota());
		} else if (escolha == 'N') {
			System.out.println("=====================================");
			System.out.println("              Aluno 1                ");
			System.out.println("=====================================");
			System.out.println("Nome do aluno: " + getNome());
			System.out.println("Idade do aluno: " + getIdade());
			System.out.println("Nota do aluno: " + getNota());
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getNovaNota() {
		return novaNota;
	}

	public void setNovaNota(double novaNota) {
		this.novaNota = novaNota;
	}

}
