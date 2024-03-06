package math;

public class CalculatorImpl implements Calculator {


    protected CalculatorImpl() {
    }

    @Override
    public double add(double a, double b) {
        try {
            Thread.sleep(10);
            return a + b;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public double sub(double a, double b) {

        return add(a, -b);
    }
}
