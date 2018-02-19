package musta.belmo.designpatterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {
    @Test
    public void testSingleton() {
        Singleton instance = Singleton.getInstance();
        Singleton anotherInstance = Singleton.getInstance();
        /**
         * asserts the fact that instance and anotherInstance have the same reference.
         */
        assertEquals(instance, anotherInstance);
    }


}