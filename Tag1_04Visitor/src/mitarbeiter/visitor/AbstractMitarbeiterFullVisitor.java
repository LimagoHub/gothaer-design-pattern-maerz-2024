package mitarbeiter.visitor;

import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public abstract class AbstractMitarbeiterFullVisitor extends AbstractMitarbeiterVisitor{
    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        // ok
    }

    @Override
    public void visit(final GehaltsEmpfaenger gehaltsEmpfaenger) {
        // ok
    }
}
