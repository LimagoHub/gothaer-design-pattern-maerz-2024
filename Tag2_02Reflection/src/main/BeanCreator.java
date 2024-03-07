package main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class BeanCreator {

    // Vor. Klasse ist eine Bean-> no-args-ctor und hat getter und setter (alle Attribute sind Strings)

    private Scanner scanner = new Scanner(System.in);
    private static final String PREFIX = "set";
    public Object createAndFillBean(String fullQualifiedClassName) {
        try {
            Object retval = Class.forName(fullQualifiedClassName).getConstructor().newInstance();
            for(Method method: retval.getClass().getDeclaredMethods()){
                if(method.getName().startsWith(PREFIX)) {
                    System.out.printf("Bitte Wert fuer %s eingeben: ", method.getName().substring(PREFIX.length()));
                    method.invoke(retval, scanner.nextLine());
                }
            }
            return retval;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
