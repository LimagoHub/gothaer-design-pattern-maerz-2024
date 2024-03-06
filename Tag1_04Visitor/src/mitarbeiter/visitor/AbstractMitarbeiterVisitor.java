package mitarbeiter.visitor;

import mitarbeiter.GehaltsEmpfaenger;
import mitarbeiter.LohnEmpfaenger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor{


    public void init() {
        // ok
    }

    public void dispose() {
        // NOP
    }
}
