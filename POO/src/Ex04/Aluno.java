package Ex04;

public class Aluno {

	private String nome;
	private String matricula;
	private double notaFinal;

	public Aluno() {
		this.nome = "Arthur";
		this.matricula = "42123";
		this.notaFinal = 10.0;
	}

	public Aluno(String nome, String matricula, Double notaFinal) {
		this.nome = nome;
		this.matricula = matricula;
		this.notaFinal = notaFinal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

}
