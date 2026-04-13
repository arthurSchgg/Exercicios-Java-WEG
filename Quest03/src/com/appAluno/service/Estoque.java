package com.appAluno.service;

import java.util.ArrayList;
import java.util.List;

import com.appAluno.model.Aluno;
import com.appAluno.view.Atendente;

public class Estoque {
    List<Aluno> alunos;

    public Estoque() {
        alunos = new ArrayList<>();
    }

    public int gerenciarAlunos(int escolha, Atendente atendente) {
        switch (escolha) {
            case 1:
                String nome = atendente.nomeAluno();
                int matricula = atendente.matriculaAluno();
                String anoIngresso = atendente.anoIngressoAluno();
                Aluno aluno = new Aluno(nome, matricula, anoIngresso);
                alunos.add(aluno);
                break;

            case 2:
                for (Aluno aluno1 : alunos) { // BEGIN:
                    atendente.listarAlunos(aluno1);
                }
                break;

            case 3:
                String nomeRemover = atendente.perguntarAlunoRemover();
                Aluno alunoRemover = null;
                for (Aluno a : alunos) {
                    if (a.getNome().equalsIgnoreCase(nomeRemover)) {
                        alunoRemover = a;
                        break;
                    }
                }
                if (alunoRemover != null) {
                    alunos.remove(alunoRemover);
                    String mensagemRemocao = atendente.removerAluno(nomeRemover);
                    System.out.println(mensagemRemocao);
                    atendente.vizualizarAlunoRemovido(nomeRemover);
                } else {
                    System.out.println("Aluno não encontrado.");
                }
                break;

            case 4:
                String nomeBuscar = atendente.perguntarAlunoBuscar();
                Aluno alunoBuscar = null;
                for (Aluno a : alunos) {
                    if (a.getNome().equalsIgnoreCase(nomeBuscar)) {
                        alunoBuscar = a;
                        break;
                    }
                }
                if (alunoBuscar != null) {
                    atendente.listarAlunos(alunoBuscar);
                } else {
                    System.out.println("Aluno não encontrado.");
                }
                break;
        }
        return escolha;
    }
}
