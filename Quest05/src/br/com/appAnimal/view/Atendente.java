package br.com.appAnimal.view;

import java.util.Scanner;

import br.com.appAnimal.model.AnimalEstimacao;

public class Atendente {
	Scanner sc;

	public Atendente() {
		sc = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("------------------------------------");
		System.out.println("|==========|| Canilbom ||==========|");
		System.out.println("|----------------------------------|");
		System.out.println("| [1] Cadastrar animal             |");
		System.out.println("| [2] Listar animal                |");
		System.out.println("| [3] Remover animal (pela espécie)|");
		System.out.println("| [4] Buscar animal (pelo espécie) |");
		System.out.println("| [5] Sair                         |");
		System.out.println("|----------------------------------|");
		System.out.print("Escolha uma opção: ");
		int opcao = sc.nextInt();
		sc.nextLine();
		return opcao;
	}

	public String especieAnimal() {
		System.out.print("Escreva o espécie do animal: ");
		return sc.nextLine();
	}

	public String racaAnimal() {
		System.out.print("Escreva a raça do animal: ");
		return sc.nextLine();
	}

	public int idadeAnimal() {
		System.out.print("Escreva a idade do animal: ");
		int idade = sc.nextInt();

		return idade;

	}

	public double pesoAnimal() {
		System.out.print("Escreva o peso do animal: ");
		double peso = sc.nextDouble();

		return peso;
	}

	public void vizualizar(AnimalEstimacao animal) {
		System.out.println("=-=-=-=-=-=-=-=-=-=");
		System.out.println("Espécie do animal: " + animal.getEspecie());
		System.out.println("Raça do animal: " + animal.getRaca());
		System.out.println("Idade animal: " + animal.getIdade());
		System.out.printf("Peso do animal: %.2f KG", animal.getPeso());
		System.out.println("\n=-=-=-=-=-=-=-=-=-=\n");
	}

	public String perguntaAnimalRemover() {
		System.out.print("Escreva a espécie do animal que deseja remover: ");
		return sc.nextLine();
	}

	public void mensagemAnimalRemovido(String especie) {
		System.out.println("O animal cuja espécie é '" + especie + "' foi removido!");
	}

	public void mensagemNaoencontrado(String especie) {
		System.out.println("O animal cuja espécie é '" + especie + "' não foi encontrado");
	}

	public String perguntaParaBuscar() {
		System.out.print("Escreva a espécie do animal que deseja buscar: ");
		return sc.nextLine();
	}

}
