package model.livro;

public class LivroLiterario extends Livro {

	private String genero;

	public LivroLiterario(int codigo, String titulo, String autor, int estoque, String genero) {
		super(codigo, titulo, autor, estoque);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Livro literário com genero '" + genero + "', Código: " + codigo + ", Título: " + titulo + ", Autor: "
				+ autor + ", Estoque: " + estoque;
	}
}
