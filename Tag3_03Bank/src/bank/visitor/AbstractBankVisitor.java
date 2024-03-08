package bank.visitor;

import bank.Konto;
import bank.KontoGruppe;

public abstract class AbstractBankVisitor implements BankVisitor{
    @Override
    public void init() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void visit(final Konto konto) {

    }

    @Override
    public void visit(final KontoGruppe kontoGruppe) {

    }
}
