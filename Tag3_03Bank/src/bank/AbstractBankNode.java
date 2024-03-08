package bank;

import bank.visitor.BankVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractBankNode implements Iterable<AbstractBankNode>{

    private AbstractBankNode parent = null;
    private String label;

    public AbstractBankNode(final String label) {
        this.label = label;
    }

    public AbstractBankNode getParent() {
        return parent;
    }

    public void setParent(final AbstractBankNode parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public List<AbstractBankNode> getChildren() {
        return Collections.emptyList();
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName() + "{");
        sb.append(", label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void print() {
       iterator().forEachRemaining(System.out::println);

//       for(var item: this) {
//           System.out.println(item);
//       }
    }

    @Override
    public Iterator<AbstractBankNode> iterator() {
        List<AbstractBankNode> liste = new ArrayList<>();
        iteratorImpl(liste);
        return liste.iterator();
    }

    private void iteratorImpl(List<AbstractBankNode> liste) {
        liste.add(this);
        for(var child: getChildren()) {
            child.iteratorImpl(liste);
        }
    }

    public abstract void accept(BankVisitor visitor);

    public void iterate(BankVisitor visitor) {
        visitor.init();
        iterator().forEachRemaining(item->item.accept(visitor));
        visitor.dispose();
    }
}
