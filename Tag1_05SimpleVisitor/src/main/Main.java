package main;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {


        List<String> liste = List.of("10", "20", "30");



        liste.forEach((s->{
            int x = Integer.valueOf(s);
            x += 10;
            System.out.println(x);}));


        System.out.println("Hello world!");
    }
}