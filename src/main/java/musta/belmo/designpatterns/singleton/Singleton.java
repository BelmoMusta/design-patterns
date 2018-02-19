package musta.belmo.designpatterns.singleton;

import java.util.Optional;

/**
 * The singleton class.
 */
public class Singleton {
    /**
     * a static reference to the unique instance of the singleton.
     */
    private static Optional<Singleton> singleton = Optional.empty();

    /**
     * @return the instance of the singleton.
     */
    public static Singleton getInstance() {
        if (!singleton.isPresent()) {
            singleton = Optional.of(new Singleton());
        }
        return singleton.get();

    }

    private Singleton() {
        System.out.println("private constructor to prevent external instantiation ");
    }

}
