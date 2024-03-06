package math;

import java.time.Duration;
import java.time.Instant;

public class CalculatorBenchmark implements Calculator{

    private final Calculator calculator;

    protected CalculatorBenchmark(final Calculator calculator) {
        this.calculator = calculator;
    }

    public double add(final double a, final double b) {
        Instant start = Instant.now();
        double result = calculator.add(a, b);
        Instant ende = Instant.now();
        System.out.println(Duration.between(start,ende).toMillis());
        return result;
    }

    public double sub(final double a, final double b) {
        return calculator.sub(a, b);
    }
}
