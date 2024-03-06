package business;

public class StateB extends AbstractState{
    public StateB(final BusinessObject businessObject) {
        super(businessObject);
    }

    @Override
    public void drucken() {
        System.out.println("Hier druckt B");
    }

    @Override
    public void changeToA() {
        getBusinessObject().current = getBusinessObject().stateA;
    }
}
