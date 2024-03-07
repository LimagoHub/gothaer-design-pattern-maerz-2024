package main;

import client.CalcClient;
import math.*;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) throws Exception{


        CalculatorFactory.setLogger(true);
        CalculatorFactory.setBenchmark(false);

        Calculator calculator = CalculatorFactory.create();



        CalcClient calcClient = new CalcClient(calculator);
        calcClient.go();
    }
}