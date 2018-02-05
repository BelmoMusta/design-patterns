package musta.belmo.designpatterns.builder;


import java.util.ArrayList;
import java.util.List;

public class Polygon {

    private String name;
    private List<Point> points;

    public Polygon() {
        name = "polygone";
        points = new ArrayList<>();
    }

    public Polygon(String name) {
        this();
        this.name = name;
    }

    public void addPoint(Point p) {
        points.add(p);
    }

    public void removePointAt(int index) {
        if (index >= 0 && index < points.size()){
            points.remove(index);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Point> getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "polygon:{name:" + name + "," + "points:" + points + "}";
    }

    public static PolygonBuilder builder() {

        return new PolygonBuilder();
    }

    public static class PolygonBuilder {
        private Polygon polygon;

        public PolygonBuilder() {
            polygon = new Polygon();
        }

        public PolygonBuilder point(Point p) {
            polygon.addPoint(p);
            return this;
        }

        public PolygonBuilder removePointAt(int index) {
            polygon.removePointAt(index);
            return this;
        }

        public PolygonBuilder name(String name) {
            polygon.setName(name);
            return this;
        }

        public PolygonBuilder points(List<Point> points) {
            polygon.setPoints(points);
            return this;
        }

        public Polygon build() {
            return polygon;
        }
    }
}

