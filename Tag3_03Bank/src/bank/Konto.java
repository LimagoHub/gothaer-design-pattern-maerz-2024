package bank;

import bank.visitor.BankVisitor;

public class Konto extends AbstractBankNode {
    public Konto(final String label) {
        super(label);
    }

    @Override
    public void accept(final BankVisitor visitor) {
        visitor.visit(this);
    }
}
