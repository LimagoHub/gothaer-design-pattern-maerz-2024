package bank.visitor;

import bank.Konto;
import bank.KontoGruppe;

public interface BankVisitor {
    void init();
    void dispose();
    void visit(Konto konto);
    void visit(KontoGruppe kontoGruppe);
}
