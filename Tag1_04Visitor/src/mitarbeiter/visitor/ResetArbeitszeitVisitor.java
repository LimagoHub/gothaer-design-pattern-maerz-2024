package mitarbeiter.visitor;

import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public class ResetArbeitszeitVisitor extends AbstractMitarbeiterFullVisitor{
    @Override
    public void visit(final LohnEmpfaenger lohnEmpfaenger) {
        lohnEmpfaenger.setArbeitszeit(0);
    }
}
