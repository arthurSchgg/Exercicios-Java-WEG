package br.com.appCasa.view;

import java.util.Scanner;

import br.com.appCasa.model.Casa;

public class Atendente {
	Scanner sc;

	public Atendente() {
		sc = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("------------------------------------");
		System.out.println("|=========|| Imoveiouse ||=========|");
		System.out.println("|----------------------------------|");
		System.out.println("| [1] Cadastrar casa               |");
		System.out.println("| [2] Listar casas (pelo endereço) |");
		System.out.println("| [3] Remover casa (pelo endereço) |");
		System.out.println("| [4] Buscar casa (pelo endereço)  |");
		System.out.println("| [5] Sair                         |");
		System.out.println("|----------------------------------|");
		System.out.print("Escolha uma opção: ");
		int opcao = sc.nextInt();
		sc.nextLine();
		return opcao;
	}

	public String enderecoCasa() {
		System.out.print("Escreva o endereço da casa: ");
		return sc.nextLine();

	}

	public double areaCasa() {
		System.out.print("Digite a área da casa (m²): ");
		double areaCasa = sc.nextDouble();

		return areaCasa;
	}

	public int numerosQuartosCasa() {
		System.out.print("Digite a quantidade de quartos na casa: ");
		int numerosQuartosCasa = sc.nextInt();

		return numerosQuartosCasa;

	}

	public double precoCasa() {
		System.out.print("Digite o preço da casa: R$");
		double precoCasa = sc.nextDouble();

		return precoCasa;
	}

	public void vizualizar(Casa casa) {
		System.out.println("=-=-=-=-=-=-=-=-=");
		System.out.println("Endereço: " + casa.getEndereco());
		System.out.printf("Área da casa: %.2f m²", casa.getArea());
		System.out.println("\nNúmeros de quartos na casa: " + casa.getNumerosQuartos());
		System.out.printf("Preço da casa: %.2f R$\n", casa.getPreco());
	}

	public String perguntaParaRemover() {
		System.out.print("Escreva um endereço de uma casa para remover: ");
		return sc.nextLine();

	}

	public void mensagemCasaRemovida(String endereco) {
		System.out.println("A casa com endereço '" + endereco + "' foi removida!");

	}
	
	public void mensagemNaoEncontrada(String endereco) {
		System.out.println("A casa com endereco '" + endereco + "' não foi encontrada");
	}
	
	public String perguntaParaBuscar() {
		System.out.print("Escreva um endereço de uma casa para buscar:");
		return sc.nextLine();
	}

}
