package main;

import service.Central;
import view.Atendente;

public class Main {
    public static void main(String[] args) {
        Central central = new Central();
        Atendente atendente = new Atendente();
        int op = -1;

        do {
            op = atendente.Menu();

            if (op != 0) {
                central.gerenciarEstoque(op, atendente);
            } else {
                atendente.mensagemSaida();
            }
        } while(op != 0);
    }
}