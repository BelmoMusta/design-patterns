package musta.belmo.designpatterns.builder;

import org.junit.Test;

import java.util.Calendar;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


public class BuilderTest {

    @Test
    public void testBuilder() {
        Student.StudentBuilder builder = new Student.StudentBuilder();
        Student student = builder
                .id("123456")
                .name("musta")
                .dateOfBirth(Calendar.getInstance().getTime())
                .address("address 1 ")
                .build();

        assertNotNull(student);
        assertNotNull(student.getId());
        assertNotNull(student.getAddress());
        assertNotNull(student.getName());
        assertNotNull(student.getBirthDate());
    }

    @Test
    public void testBuilderFails() {
        Polygon.PolygonBuilder polygonBuilder = Polygon.builder();
        polygonBuilder.point(new Point(0, 0))
                .name("myPolygone")
                .point(new Point(1, 1));
        Polygon polygon = polygonBuilder.build();

        assertNotNull(polygon);
        assertNotNull(polygon.getName());
        assertEquals(polygon.getPoints().size(),2);
    }
}
