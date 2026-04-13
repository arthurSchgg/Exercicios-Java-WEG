package model.livro;

public class Livro {

	protected int codigo;
	protected String titulo;
	protected String autor;
	protected int estoque;

	public Livro(int codigo, String titulo, String autor, int estoque) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.estoque = estoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "Livro Código: " + codigo + ", Título: " + titulo + ", Autor: " + autor + ", Estoque: " + estoque;
	}
}
