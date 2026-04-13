package Ex11;

import java.util.Scanner;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto () {	
		this.nome = "";
		this.preco = 0.0;
		this.quantidade = 0;
	}
	
	public Produto (String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void atualizarPreco(Scanner sc) {
		System.out.print("\nVocê deseja atualizar o preco do produto? (S/N): ");
		char escolha = Character.toUpperCase(sc.next().charAt(0));
		
		if (escolha == 'S') {
			System.out.print("Escreva o novo preco do produto: R$ ");
			double novoPreco = sc.nextDouble();
			this.setPreco(novoPreco);
			System.out.println("Preço atualizado!");
		}
	}
	
	public void atualizarQuantidade(Scanner sc) {
		System.out.print("Você deseja atualizar a quantidade do produto? (S/N): ");
		char escolha = Character.toUpperCase(sc.next().charAt(0));
		
		if (escolha == 'S') {
			System.out.print("Escreva a nova quantidade do produto: ");
			int novaQuantidade = sc.nextInt();
			this.setQuantidade(novaQuantidade);
			System.out.println("Quantidade atualizada!");
		}
	}
	
	public void exibirProduto () {
		System.out.println("\n--- Dados do Produto ---");
		System.out.println("Nome do produto: " + getNome());
		System.out.printf("Preço do produto: R$ %.2f", getPreco());
		System.out.println("\nA quantidade de produtos é de: " + getQuantidade());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}