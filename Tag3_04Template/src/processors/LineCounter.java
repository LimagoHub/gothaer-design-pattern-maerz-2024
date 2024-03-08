package processors;

public class LineCounter extends AbstractCounterHandler{


    public LineCounter() {
        super("Zeilen");
    }

    @Override
    public void process(final char c) {
        if(c=='\n')
            incrementCounter();
    }


}
