package Ex10;

public class Funcionario {

	private String nome;
	private double salario;
	private String cargo;

	public Funcionario() {
		this.nome = "Ricardo Oliveira";
		this.salario = 12500.00;
		this.cargo = "Gerente de Projetos";
	}

	public Funcionario(String nome, Double salario, String cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
