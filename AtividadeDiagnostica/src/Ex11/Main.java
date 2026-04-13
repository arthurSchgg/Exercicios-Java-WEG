package Ex11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		char escolha;
		
		do {
			System.out.print("Escreva o nome do produto: ");
			String nome = sc.next();
			
			System.out.print("Escreva o preco do produto: R$ ");
			double preco = sc.nextDouble();
			
			System.out.print("Escreva a quantidade de produtos: ");
			int quantidade = sc.nextInt();
			
			produto.setNome(nome);
			produto.setPreco(preco);
			produto.setQuantidade(quantidade);
			
			produto.atualizarPreco(sc);
			
			produto.atualizarQuantidade(sc);
			
			produto.exibirProduto();
			
			System.out.print("\nDeseja registrar um novo produto? (S/N): ");
			escolha = Character.toUpperCase(sc.next().charAt(0));
			System.out.println("---");
			
		} while (escolha != 'N');
		
		System.out.println("Programa encerrado.");
		sc.close();
	}
}