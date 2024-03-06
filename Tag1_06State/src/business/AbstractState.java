package business;

public abstract class AbstractState implements State{


    private final BusinessObject businessObject;

    public AbstractState(final BusinessObject businessObject) {
        this.businessObject = businessObject;
    }

    public BusinessObject getBusinessObject() {
        return businessObject;
    }

    @Override
    public void drucken() {
        throw new UnsupportedOperationException("Diese Funktion macht in diesem Status keinen Sinn");
    }

    @Override
    public void changeToA() {
        throw new UnsupportedOperationException("Diese Funktion macht in diesem Status keinen Sinn");
    }

    @Override
    public void changeToB() {
        throw new UnsupportedOperationException("Diese Funktion macht in diesem Status keinen Sinn");
    }
}
