package business;

public class StateA extends AbstractState{
    public StateA(final BusinessObject businessObject) {
        super(businessObject);
    }

    @Override
    public void drucken() {
        System.out.println("Hier druckt A");
    }

    @Override
    public void changeToB() {
        getBusinessObject().current = getBusinessObject().stateB;
    }
}
