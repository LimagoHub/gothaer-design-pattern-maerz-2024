package main;

import firma.Firma;
import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;
import mitarbeiter.visitor.PrintVisitor;
import mitarbeiter.visitor.ResetArbeitszeitVisitor;
import mitarbeiter.visitor.StatistikVisitor;

public class Main {
    public static void main(String[] args) {

        Firma firma = new Firma();

        firma.add(new GehaltsEmpfaenger("Hinz", 1000));
        firma.add(new LohnEmpfaenger("Mayer", 15,25));
        firma.add(new LohnEmpfaenger("Müller", 12.5,25));
        firma.add(new LohnEmpfaenger("Schulz", 15,36));
        firma.add(new GehaltsEmpfaenger("Kunz", 1000));

        //firma.print();
        firma.iterate(new PrintVisitor());
        firma.iterate(new ResetArbeitszeitVisitor());
        firma.iterate(new PrintVisitor());

        firma.iterate(new StatistikVisitor());
    }
}