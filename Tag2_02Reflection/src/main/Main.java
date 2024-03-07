package main;

import tiere.Schwein;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{

        /*

        Class clazz;
        // 1 Moeglichkeit
        clazz = Schwein.class;

        // 2 Moeglichkeit
        Schwein piggy = new Schwein();
        clazz = piggy.getClass();

        // 3 Moeglichkeit
        clazz = Class.forName("tiere.Schwein");

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        System.out.println("--------------------------------------");
        Method methods[] = clazz.getMethods();
        for (int i = 0; i < methods.length ; i++) {
            System.out.println(methods[i].getName());
        }
        System.out.println("--------------------------------------");
        methods = clazz.getDeclaredMethods();
        for (int i = 0; i < methods.length ; i++) {
            System.out.println(methods[i].getName());
        }
        System.out.println("--------------------------------------");
        Object object = clazz.getConstructor().newInstance();
        System.out.println(object);

        object = clazz.getConstructor(String.class).newInstance("Miss Piggy");
        System.out.println(object);

        Method method = clazz.getMethod("fressen");
        method.invoke(object);
        System.out.println(object);

        method = clazz.getDeclaredMethod("setGewicht", int.class);
        method.setAccessible(true);
        method.invoke(object, -100);
        System.out.println(object);

         */
        BeanCreator beanCreator = new BeanCreator();
        Object object = beanCreator.createAndFillBean("beans.Person");
        System.out.println(object);

    }
}