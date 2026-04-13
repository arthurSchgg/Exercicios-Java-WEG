package Ex10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		char escolha;

		do {
			System.out.print("\nEscreva o nome do aluno: ");
			String nome = sc.next();

			System.out.print("Escreva a idade do aluno: ");
			int idade = sc.nextInt();

			System.out.print("Escreva a nota do aluno: ");
			double nota = sc.nextDouble();

			aluno.setNome(nome);

			aluno.setIdade(idade);

			aluno.setNota(nota);

			escolha = aluno.atualizarNota();

			aluno.exibirDetalhes();

		} while (escolha != 'N');

		sc.close();

	}

}
