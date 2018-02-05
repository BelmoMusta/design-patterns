package musta.belmo.designpatterns.builder;


import java.util.ArrayList;
import java.util.List;

/**
 * A class representing an implementation of the 2D polygon;
 */
public class Polygon {
    /**
     * the name of the polygon
     */
    private String name;
    /**
     * the list of the points that construct the polygon.
     */
    private List<Point> points;

    /**
     * The default constructor.
     */
    public Polygon() {
        name = "polygone";
        points = new ArrayList<>();
    }

    /**
     * Method to add a point to the current polygon.
     *
     * @param point the point to be added.
     */
    public void addPoint(Point point) {
        points.add(point);
    }

    /**
     * removes the point having the given index.
     *
     * @param index the index of the point.
     */
    public void removePointAt(int index) {
        if (index >= 0 && index < points.size()) {
            points.remove(index);
        }
    }

    /**
     * Sets the name of the current polygon.
     *
     * @param name the new name of the polygon.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter of the list of the points of this polygon.
     *
     * @return list of points.
     */
    public List<Point> getPoints() {
        return points;
    }

    /**
     * Getter of the name of the current polygon.
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter of the points of the current polygon.
     *
     * @param points the new list of points.
     */
    public void setPoints(List<Point> points) {
        this.points = points;
    }

    /**
     * Overriding the toString method.
     *
     * @return String.
     */
    @Override
    public String toString() {
        return "polygon:{name:" + name + "," + "points:" + points + "}";
    }

    /**
     * The polygonBuilder
     *
     * @return polygonBuilder
     */
    public static PolygonBuilder builder() {

        return new PolygonBuilder();
    }

    /**
     * A static class serving as the polygon builder.
     */
    public static class PolygonBuilder {
        private Polygon polygon;

        /**
         * The default constructor.
         */
        public PolygonBuilder() {
            polygon = new Polygon();
        }

        /**
         * Method adds a point to the polygon.
         *
         * @param point the point to be added to the polygon.
         * @return polygonBuilder.
         */
        public PolygonBuilder point(Point point) {
            polygon.addPoint(point);
            return this;
        }

        /**
         * Method gives the polygon a name.
         *
         * @param name the name to be assigned to the polygon.
         * @return polygonBuilder.
         */
        public PolygonBuilder name(String name) {
            polygon.setName(name);
            return this;
        }

        /**
         * Method adds a list of points to the polygon.
         *
         * @param points the points to be added to the polygon.
         * @return polygonBuilder.
         */
        public PolygonBuilder points(List<Point> points) {
            polygon.setPoints(points);
            return this;
        }

        /**
         * the build method
         *
         * @return the built polygon.
         */
        public Polygon build() {
            return polygon;
        }
    }
}

