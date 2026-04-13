package com.appAluno.main;

import com.appAluno.view.Atendente;

import com.appAluno.service.Estoque;

public class Main {
    public static void main(String[] args) {
        Atendente atendente = new Atendente();
        Estoque estoque = new Estoque();
        int escolhaMenu = 1;

        do {
            escolhaMenu = atendente.menuPrincipal();
            escolhaMenu = estoque.gerenciarAlunos(escolhaMenu, atendente);
        } while (escolhaMenu != 5);

        atendente.finalizarApp();
    }
}
