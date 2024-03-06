package main;

import flyweight.AttributedCharacter;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

       /* AttributedCharacter a1 = AttributedCharacter.getInstance('A', false);
        AttributedCharacter a2 = AttributedCharacter.getInstance('A', false);
        AttributedCharacter a3 = AttributedCharacter.getInstance('A', true);

        System.out.println(a1 == a2);
        System.out.println(a1 == a3);*/

        StringBuilder s = new StringBuilder("");

        Instant start = Instant.now();
        for (int i = 0; i < 2_000_000; i++) {
            s.append("A");
        }

        String string = s.toString();

        Instant ende = Instant.now();
        System.out.println("Duration = " + Duration.between(start, ende).toMillis());
    }
}