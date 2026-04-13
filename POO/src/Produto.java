public class Produto {
	
	String nome;
	double preco;
	int quantidade;
	
	public Produto() {
		this.nome = "";
		this.preco = 0.0;
		this.quantidade = 0; 
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
		
	}
	

}
