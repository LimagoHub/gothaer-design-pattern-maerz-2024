package mitarbeiter.visitor;

import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public class StatistikVisitor implements MitarbeiterVisitor{

    private int lohnCount;
    private int gehaltCount;


    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        lohnCount ++;
    }

    @Override
    public void visit(final GehaltsEmpfaenger gehaltsEmpfaenger) {
        gehaltCount ++;
    }

    @Override
    public void init() {
        lohnCount = gehaltCount = 0 ;
    }

    @Override
    public void dispose() {
        System.out.println(this);
    }

    public int getLohnCount() {
        return lohnCount;
    }

    public int getGehaltCount() {
        return gehaltCount;
    }

    public int getGesamtCount() {
        return lohnCount + gehaltCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatistikVisitor{");
        sb.append("lohnCount=").append(lohnCount);
        sb.append(", gehaltCount=").append(gehaltCount);
        sb.append(", gesamtCount=").append(getGesamtCount());
        sb.append('}');
        return sb.toString();
    }
}
