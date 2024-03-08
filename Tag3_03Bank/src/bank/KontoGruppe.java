package bank;

import bank.visitor.BankVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KontoGruppe extends AbstractBankNode {

    private List<AbstractBankNode> children = new ArrayList<>();

    public KontoGruppe(final String label) {
        super(label);
    }

    @Override
    public List<AbstractBankNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void appendChild(AbstractBankNode child) {
        child.setParent(this);
        children.add(child);
    }

    public void removeChild(AbstractBankNode child) {
        child.setParent(null);
        children.remove(child);
    }

    @Override
    public void accept(final BankVisitor visitor) {
        visitor.visit(this);
    }
}
