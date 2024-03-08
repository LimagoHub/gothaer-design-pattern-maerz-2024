package main;

import bank.AbstractBankNode;
import bank.Konto;
import bank.KontoGruppe;
import bank.visitor.PrintVisitor;

public class Main {
    public static void main(String[] args) {

        KontoGruppe root = new KontoGruppe("root");

        KontoGruppe e1 = new KontoGruppe("E1");
        root.appendChild(e1);

        KontoGruppe e2 = new KontoGruppe("E2");
        root.appendChild(e2);

        KontoGruppe e2_1= new KontoGruppe("E2_1");
        e1.appendChild(e2_1);

        Konto e2_2= new Konto("E2_2");
        e1.appendChild(e2_2);

        KontoGruppe e2_3= new KontoGruppe("E2_3");
        e2.appendChild(e2_3);

        Konto e2_4= new Konto("E2_4");
        e2.appendChild(e2_4);

        //travers(root);
        //root.print();

        root.iterate(new PrintVisitor());
//        for(var item: root){
//            System.out.println(item);
//        }
    }

    private static void travers(AbstractBankNode knoten) {
        System.out.println(knoten);
        for(AbstractBankNode child: knoten.getChildren()) {
            travers(child);
        }
    }
}