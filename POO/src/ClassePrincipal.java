public class ClassePrincipal {
	public static void main(String[] args) {
	
		
		Produto produto = new Produto();
		
		System.out.println(produto.nome);
		System.out.println(produto.preco);
		System.out.println(produto.quantidade);
		
		produto.nome = "Pudim";
		produto.preco = 10.0;
		produto.quantidade = 20;
		
		System.out.println("=-=-=-=-=");
		
		System.out.println(produto.nome);
		System.out.println(produto.preco);
		System.out.println(produto.quantidade);
		
		System.out.println("=-=-=-=-=");
		
		Produto produto1 = new Produto("Abacaxi", 9.50, 20);
		
		System.out.println(produto1.nome);
		System.out.println(produto1.preco);
		System.out.println(produto1.quantidade);
		
		
	}

}



