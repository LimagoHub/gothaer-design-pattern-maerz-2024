package processors;

public abstract class AbstractCounterHandler implements CharacterHandler{
    private int counter;
    private final String label;

    public AbstractCounterHandler(final String label) {
        this.label = label;
    }

    @Override
    public void init() {
        counter = 0;
    }



    @Override
    public void dispose() {
        System.out.println(String.format("Anzahl %s: %d", label, counter));
    }

    protected void incrementCounter() {
        counter ++;
    }
}
