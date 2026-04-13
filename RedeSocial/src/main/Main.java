package main;

import service.Feed;
import view.Atendente;

public class Main {
    public static void main (String[] args){
        Feed feed = new Feed();
        Atendente atendente = new Atendente();
        int op;

        do{
            op = atendente.Menu();
            feed.gerenciarFeed(op, atendente);
        } while(op != 0);
    }
}
