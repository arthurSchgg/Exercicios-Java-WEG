package Ex04;

public class Main {
	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setNome("Ada Devine");
		aluno.setMatricula("LGC-1001");
		aluno.setNotaFinal(9.8);

		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Número da matricula: " + aluno.getMatricula());
		System.out.println("Nota final: " + aluno.getNotaFinal());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Aluno aluno1 = new Aluno("Claudio", "86324", 9.5);

		aluno1.setNome("Javán Script Santos");
		aluno1.setMatricula("FUNC-A002");
		aluno1.setNotaFinal(8.5);

		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Número da matricula: " + aluno1.getMatricula());
		System.out.println("Nota final: " + aluno1.getNotaFinal());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Aluno aluno2 = new Aluno("Roger", "79421", 7.8);

		aluno2.setNome("Rubens Ruby Onofre");
		aluno2.setMatricula("RAILS-B003");
		aluno2.setNotaFinal(7.0);

		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("Número da matricula: " + aluno2.getMatricula());
		System.out.println("Nota final: " + aluno2.getNotaFinal());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Aluno aluno3 = new Aluno("Yuri Alberto", "64193", 9.68);

		aluno3.setNome("Memphis Papay");
		aluno3.setMatricula("DATA-C004");
		aluno3.setNotaFinal(10.0);

		System.out.println("Nome: " + aluno3.getNome());
		System.out.println("Número da matricula: " + aluno3.getMatricula());
		System.out.println("Nota final: " + aluno3.getNotaFinal());

	}

}
