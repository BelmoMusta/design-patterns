package musta.belmo.designpatterns.observer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class ObserverTest {
    @Test
    public void testObserver() {
        Child child = new Child();
        Parent mother = new Mother(child);
        Parent father = new Father(child);

        child.addObserver(mother);
        child.addObserver(father);

        Listener<Child> listener = childListener -> {
            System.out.println("Child fed ! ");

        };

        child.setListener(listener);
        child.setHungry(true);

        assertEquals(("Fed by : Mother\r\n" +
                "Child fed ! \r\n").trim().length(), outContent.toString().trim().length());
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

}
