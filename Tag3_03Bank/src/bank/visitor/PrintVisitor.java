package bank.visitor;

import bank.Konto;
import bank.KontoGruppe;

public class PrintVisitor extends AbstractBankVisitor{

    @Override
    public void visit(final Konto konto) {
        System.out.println(konto);
    }

    @Override
    public void visit(final KontoGruppe kontoGruppe) {
        System.out.println(kontoGruppe);
    }
}
