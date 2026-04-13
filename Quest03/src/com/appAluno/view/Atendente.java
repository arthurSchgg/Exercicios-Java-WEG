package com.appAluno.view;

import java.util.Scanner;

import com.appAluno.model.Aluno;

public class Atendente {
    Scanner sc;
    
    public Atendente() {
        sc = new Scanner(System.in);
    }

    public int menuPrincipal(){
        System.out.println("=== Menu Principal ===");
        System.out.println("[1] Cadastrar aluno");
        System.out.println("[2] Listar alunos");
        System.out.println("[3] Remover aluno");
        System.out.println("[4] Buscar aluno");
        System.out.println("[5] Sair");
        System.out.println("========================");
        System.out.print("Escolha uma opção: ");
        int escolha = sc.nextInt();
        sc.nextLine();
        return escolha;
    }

    public String nomeAluno(){
        System.out.print("Digite o nome do aluno: ");
        return sc.nextLine();
    }

    public int matriculaAluno(){
        System.out.print("Digite a matrícula do aluno: ");
        return sc.nextInt();
    }

    public String anoIngressoAluno(){
        System.out.print("Digite o ano de ingresso do aluno: ");
        sc.nextLine(); 
        return sc.nextLine();
    }

    public void listarAlunos(Aluno aluno){
        System.out.println("=== Lista de Alunos ===");
        System.out.println("Nome aluno: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Ano de ingresso: " + aluno.getAnoIngresso());
    }

    public String perguntarAlunoRemover(){
        System.out.print("Digite o nome do aluno que deseja remover: ");
        return sc.nextLine();
    }

    public String perguntarAlunoBuscar(){
        System.out.print("Digite o nome do aluno que deseja buscar: ");
        return sc.nextLine();
    }

    public String removerAluno(String nome){
        return "Aluno " + nome + " removido com sucesso!";
    }

    public void vizualizarAlunoRemovido(String nome){
            System.out.println("Aluno " + nome + " foi removido!");

    }

    public void mensagemAlunoNaoEncontrado(){
        System.out.println("Aluno não encontrado!");
    }

    public void finalizarApp() {
		System.out.println("Sistema encerrado.");
	}
}
