package Model;

public class Livro extends Produto{
	
	private String autor;
	private String ISBN;
	private String genero;
	private double preco;
	private final int codigo;
	private int codigoLivro;
	
	public Livro() {
		
		super();
		this.autor = "";
		this.ISBN = "";
		this.genero = "";
		this.preco = 0.0;
		this.codigo = codigoLivro++;
		
	}
	
	public Livro(String titulo, String editora, String anoPublicacao, String autor, String ISBN, String genero, double preco) {
		super(titulo, editora, anoPublicacao);
		
		this.autor = autor;
		this.ISBN = ISBN;
		this.genero = genero;
		this.preco = preco;
		this.codigo = codigoLivro++;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
