package model;

public class ContaCorrente extends Conta{
	
	private double limiteChequeEspecial;
	
	public ContaCorrente(String numero, double limiteChequeEspecial) {
		super(numero);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	@Override
	public String toString() {
		return "Conta corrente número: " + numero + " - Limite: R$" + limiteChequeEspecial;
	}

}
