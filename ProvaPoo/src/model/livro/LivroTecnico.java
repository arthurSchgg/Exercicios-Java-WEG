package model.livro;

public class LivroTecnico extends Livro {

	private String area;

	public LivroTecnico(int codigo, String titulo, String autor, int estoque, String area) {
		super(codigo, titulo, autor, estoque);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Livro técnico da área de '" + area + "', Código: " + codigo + ", Título: " + titulo + ", Autor: " + autor
				+ ", Estoque: " + estoque;
	}
}
