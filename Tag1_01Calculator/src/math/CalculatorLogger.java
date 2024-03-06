package math;

public class CalculatorLogger implements Calculator{


    // 1000
    private final Calculator calculator;

    protected CalculatorLogger(final Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double add(final double a, final double b) {
        System.out.println("Add wurde gerufen");
        return calculator.add(a, b);
    }

    @Override
    public double sub(final double a, final double b) {
        return calculator.sub(a, b);
    }
}
