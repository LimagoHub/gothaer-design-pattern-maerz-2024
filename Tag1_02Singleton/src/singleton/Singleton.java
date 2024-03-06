package singleton;

public class Singleton {

    // Lazy
    //private static Singleton instance = null;


    // Lazy

//    public synchronized static Singleton getInstance() {
//        if(instance == null)
//            instance = new Singleton();
//        return instance;
//    }

    // Eager

    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }

    private Singleton() {

    }

    public void log(String message) {
        System.out.println(message);
    }
}
