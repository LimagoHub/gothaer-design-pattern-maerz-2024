package math;

import common.LoggerProxy;

public class CalculatorFactory {


    private static boolean logger = true;
    private static boolean secure = true;
    private static boolean benchmark = true;


    public static boolean isLogger() {
        return logger;
    }

    public static void setLogger(final boolean logger) {
        CalculatorFactory.logger = logger;
    }

    public static boolean isSecure() {
        return secure;
    }

    public static void setSecure(final boolean secure) {
        CalculatorFactory.secure = secure;
    }

    public static boolean isBenchmark() {
        return benchmark;
    }

    public static void setBenchmark(final boolean benchmark) {
        CalculatorFactory.benchmark = benchmark;
    }

    public static Calculator create() {
        Calculator calculator = new CalculatorImpl();

        // 2000      2000
        //if(logger) calculator = new CalculatorLogger(calculator);
        if(logger) calculator = (Calculator) LoggerProxy.newInstance(calculator);


        // 3000      3000
        if(secure) calculator = new CalculatorSecure(calculator);

        if(benchmark) calculator = new CalculatorBenchmark(calculator);

        return calculator;
    }
}
