package Model;

public class Revista extends Produto{
	
	private String manchete;
	private String ISSN;
	private final int codigo;
	private int codigoRevista;
	
	
	public Revista() {
		
		super();
		this.manchete = "";
		this.ISSN = "";
		this.codigo = codigoRevista++;
		
	}
	
	public Revista(String titulo, String editora, String anoPublicacao, String manchete, String ISSN) {
		super(titulo, editora, anoPublicacao);
		this.manchete = manchete;
		this.ISSN = ISSN;
		this.codigo = codigoRevista++;
		
	}

	public String getManchete() {
		return manchete;
	}

	public void setManchete(String manchete) {
		this.manchete = manchete;
	}

	public String getISSN() {
		return ISSN;
	}

	public void setISSN(String iSSN) {
		ISSN = iSSN;
	}

	public int getCodigo() {
		return codigo;
	}
}
