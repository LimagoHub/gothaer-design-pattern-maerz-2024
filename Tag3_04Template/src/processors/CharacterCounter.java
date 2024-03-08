package processors;

public class CharacterCounter extends AbstractCounterHandler{



    public CharacterCounter() {
        super("Zeichen");
    }



    @Override
    public void process(final char c) {
        incrementCounter();
    }


}
