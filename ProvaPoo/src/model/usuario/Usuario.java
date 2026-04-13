package model.usuario;


public class Usuario {

	protected String nome;
	protected String CPF;
	protected String email;
	protected String senha;
	
	public Usuario(String nome, String CPF, String email, String senha) {

		this.nome = nome;
		this.CPF = CPF;
		this.email = email;
		this.senha = senha;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario '" + nome + "', CPF: " + CPF + ", Email: " + email + ", Senha: " + senha;
	}
}
