package Ex09;

public class ContaBancaria {

	private String numeroDaConta;
	private double saldo;

	public ContaBancaria() {
		this.numeroDaConta = "12345-6";
		this.saldo = 1850.50;

	}

	public ContaBancaria(String numeroDaConta, Double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
