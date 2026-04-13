package Model;

public class Produto {
	
	protected String titulo;	
	protected String editora;
	protected String anoPublicacao;
	
	public Produto() {
		
		this.titulo = "";
		this.editora = "";
		this.anoPublicacao = "";
		
	}
	
	public Produto(String titulo, String editora, String anoPublicacao) {
		
		this.titulo = titulo;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
}
