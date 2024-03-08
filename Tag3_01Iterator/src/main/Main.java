package main;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var liste = List.of("eins","Zwei","Drei");

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        for( var item: liste) {
            System.out.println(item);
        }

        liste.forEach(System.out::println);

        Iterator<String> it = liste.iterator();
        System.out.println("---------------");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        it = liste.iterator();
        it.forEachRemaining(System.out::println);
    }
}