package model.usuario;

import java.util.ArrayList;

import service.emprestimo.Emprestimo;

public class Leitor extends Usuario {

	private ArrayList<Emprestimo> ListaEmprestimo;

	public Leitor(String nome, String CPF, String email, String senha, ArrayList<Emprestimo> ListaEmprestimo) {
		super(nome, CPF, email, senha);
		this.ListaEmprestimo = ListaEmprestimo;
	}

	public ArrayList<Emprestimo> getListaEmprestimo() {
		return ListaEmprestimo;
	}

	public void setListaEmprestimo(ArrayList<Emprestimo> listaEmprestimo) {
		ListaEmprestimo = listaEmprestimo;
	}

	@Override
	public String toString() {
		return "Leitor '" + nome + ", CPF: " + CPF + ", Email: " + email + ", Senha: " + senha + ", Lista empréstimo: "
				+ ListaEmprestimo;
	}
}
