package model.livro;

public class LivroDidatico extends Livro {

	private String disciplina;

	public LivroDidatico(int codigo, String titulo, String autor, int estoque, String disciplina) {
		super(codigo, titulo, autor, estoque);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Livro didático da disciplina '" + disciplina + "', Código: " + codigo + ", Título: " + titulo
				+ ", Autor: " + autor + ", Estoque: " + estoque;
	}
}
