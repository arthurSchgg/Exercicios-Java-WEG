package Ex09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomeProduto;
		double precoProduto;
		int quantidadeProduto;

		Produtos produtos = new Produtos();

		System.out.println("=====================================");
		System.out.println("             Produto 1               ");
		System.out.println("=====================================");

		System.out.println("Nome do produto: " + produtos.getNome());
		System.out.printf("Preço do produto: R$ %.2f", produtos.getPreco());
		System.out.println("\nQuantidade de estoque do produto: " + produtos.getQuantidadeEstoque());

		produtos.Estoque();

		Produtos produtos1 = new Produtos("Transformador 150KVa", 6560.90, 50);

		System.out.println("\n=====================================");
		System.out.println("             Produto 2               ");
		System.out.println("=====================================");

		System.out.println("Nome do produto: " + produtos1.getNome());
		System.out.printf("Preço do produto: R$ %.2f", produtos1.getPreco());
		System.out.println("\nQuantidade de estoque do produto: " + produtos1.getQuantidadeEstoque());

		produtos1.Estoque();

		Produtos produtos2 = new Produtos();

		System.out.println("\n=====================================");
		System.out.println("             Produto 3               ");
		System.out.println("=====================================");

		System.out.print("\nEscreva o nome do produto: ");
		nomeProduto = sc.nextLine();

		System.out.print("Escreva o valor do produto: R$ ");
		precoProduto = sc.nextDouble();

		System.out.print("Escreva a quantidade de produtos no estoque: ");
		quantidadeProduto = sc.nextInt();

		produtos2.setNome(nomeProduto);
		produtos2.setPreco(precoProduto);
		produtos2.setQuantidadeEstoque(quantidadeProduto);

		System.out.println("\n=====================================");
		System.out.println("             Produto 3               ");
		System.out.println("=====================================");

		System.out.println("Nome do produto: " + produtos2.getNome());
		System.out.printf("Preço do produto: R$ %.2f", produtos2.getPreco());
		System.out.println("\nQuantidade de estoque do produto: " + produtos2.getQuantidadeEstoque());

		produtos2.Estoque();

	}

}
