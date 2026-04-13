package Ex12;

public class Emprestimo {

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(int numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	private double valor;
	private String dataEmprestimo;
	private int numeroDeParcelas;

	public Emprestimo() {
		this.valor = 5000.00;
		this.dataEmprestimo = "15/10/2025";
		this.numeroDeParcelas = 24;
	}

	public Emprestimo(Double valor, String dataEmprestimo, int numeroDeParcelas) {
		this.valor = valor;
		this.dataEmprestimo = dataEmprestimo;
		this.numeroDeParcelas = numeroDeParcelas;

	}
}
