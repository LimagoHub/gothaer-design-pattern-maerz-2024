package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person p = Person.builder().vorname("anna").build();


        System.out.println(p);

        Komplex k1 = new Komplex(10,10);
        Komplex k2 = new Komplex(10f,10);
        Komplex k3 = new Komplex(10d,10);
    }
}
