package model.usuario;

import model.usuario.NivelAcesso.nivelAcesso;

public class Bibliotecario extends Usuario {

	private nivelAcesso nivel;

	public Bibliotecario(String nome, String CPF, String email, String senha, nivelAcesso nivelAcesso) {
		super(nome, CPF, email, senha);
		this.nivel = nivelAcesso;
	}

	public nivelAcesso getNivel() {
		return nivel;
	}

	public void setNivel(nivelAcesso nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Bibliotecário com nível '" + nivel + "', Nome: " + nome + ", CPF: " + CPF + ", Email: " + email
				+ ", Senha: " + senha;
	}
}
