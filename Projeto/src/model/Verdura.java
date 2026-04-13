package model;

public class Verdura extends Produto {

	private String tipo;
	private final int codigo;
	private static int codigoVerdura;

	public Verdura() {

		super();
		this.tipo = "";
		this.codigo = codigoVerdura++;

	}

	public Verdura(String nome, double preco, int quantidade, String tipo) {
		
		super(nome, preco, quantidade);
		this.tipo = tipo;
		this.codigo = codigoVerdura++;

	}

	public int getCodigo() {
		return codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
