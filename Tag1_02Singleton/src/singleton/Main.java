package singleton;



public class Main {



    public static void main(String[] args) {

        Singleton.getInstance().log("Hallo");


        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}