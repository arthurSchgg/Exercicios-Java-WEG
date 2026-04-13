package Ex05;

public class Main {
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setNome("Gilete 8 pontas");
		produto.setPreco(7.99);
		
		System.out.println("Nome do produto: " + produto.getNome());
		System.out.printf("Preço do produto: R$ %.2f" , produto.getPreco());
		
		System.out.println("\n=-=-=-=-=-=-=-=-=");

		
		Produto produto1 = new Produto("Adi2000", 250.99);
		
		produto1.setNome("Arroz");
		produto1.setPreco(27.50);
		
		System.out.println("Nome do produto: " + produto1.getNome());
		System.out.printf("Preço do produto: R$ %.2f" , produto1.getPreco());
		
		System.out.println("\n=-=-=-=-=-=-=-=-=");
		
		Produto produto2 = new Produto("Camisa do Corinthians", 599.99);
		
		produto2.setNome("Camisa reserva Corinthians");
		produto2.setPreco(699.99);
		
		System.out.println("Nome do produto: " + produto2.getNome());
		System.out.printf("Preço do produto: R$ %.2f" , produto2.getPreco());


	}

}
