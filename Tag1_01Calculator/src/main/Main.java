package main;

import client.CalcClient;
import math.Calculator;
import math.CalculatorImpl;
import math.CalculatorLogger;
import math.CalculatorSecure;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) throws Exception{


        Instant start = Instant.now();
        Thread.sleep(200);
        Instant ende = Instant.now();

        Duration duration = Duration.between(start,ende);
        System.out.println(duration.toMillis());


        // 1000                 1000
        Calculator calculator = new CalculatorImpl();

        // 2000      2000
        calculator = new CalculatorLogger(calculator);

        // 3000      3000
        calculator = new CalculatorSecure(calculator);


        CalcClient calcClient = new CalcClient(calculator);
        calcClient.go();
    }
}