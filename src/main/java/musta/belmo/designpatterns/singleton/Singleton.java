package musta.belmo.designpatterns.singleton;

/**
 * The singleton class.
 */
public class Singleton {
    /**
     * a static reference to the unique instance of the singleton.
     */
    private static Singleton singleton;

    /**
     * @return the instance of the singleton.
     */
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;

    }

    private Singleton() {
        System.out.println("private constructor to prevent external instantiation ");
    }

}
