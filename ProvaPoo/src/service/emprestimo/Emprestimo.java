package service.emprestimo;

import java.time.LocalDate;

import model.livro.Livro;
import model.usuario.Leitor;
import view.OutputView;

public class Emprestimo {

	OutputView mensagem = new OutputView();

	private int contadorNumero = 0;
	private final int numero;
	private Leitor leitor;
	private Livro livro;
	private String dataEmprestimo;
	private String dataDevolucao;
	private StatusEmprestimo status;

	public Emprestimo(Leitor leitor, Livro livro, String dataEmprestimo, String dataDevolucao,
			StatusEmprestimo status) {
		this.numero = contadorNumero++;
		this.leitor = leitor;
		this.livro = livro;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.status = status;
	}

	public int getContadorNumero() {
		return contadorNumero;
	}

	public void setContadorNumero(int contadorNumero) {
		this.contadorNumero = contadorNumero;
	}

	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public StatusEmprestimo getStatus() {
		return status;
	}

	public void setStatus(StatusEmprestimo status) {
		this.status = status;
	}

	public int getNumero() {
		return numero;
	}

	public void realizarEmprestimo(Livro livro, Leitor leitor, LocalDate dataEmprestimo) {
		if(livro.getEstoque() < 0) {
			mensagem.EstoqueVazio();
		} else {
			
		}
	}

	public void registrarDevolucao() {

	}

	@Override
	public String toString() {
		return "Emprestimo '" + contadorNumero + "', numero=" + numero + ", Leitor: " + leitor + ", Livro: " + livro
				+ ", Data empréstimo: " + dataEmprestimo + ", Data devolução: " + dataDevolucao + ", Status: " + status;
	}

}
