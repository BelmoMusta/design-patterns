package musta.belmo.designpatterns.builder;

/**
 * A class representing an abstraction of cartesian 2D Point.
 */
public class Point {
    /**
     * the X coordinate
     */
    private int x;
    /**
     * the X coordinate
     */
    private int y;

    /**
     * Constructor
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * the default constructor
     */
    public Point() {
        this(0, 0);
    }

    /**
     * the getter of the x coordiante
     *
     * @return int
     */
    public int getX() {
        return x;
    }

    /**
     * the setter of the x coordinate
     *
     * @param x the new x  coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * the getter of the  y coordinate
     *
     * @return int
     */
    public int getY() {
        return y;
    }

    /**
     * the setter of the y coordinate
     *
     * @param y the new y coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Two points are equal if they have respectively the same x and y coordinates
     *
     * @param o the other Point
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;

        return x == point.x && y == point.y;
    }

    /**
     * In order to respect the java conventions of the hashcode implementation
     *
     * @return int
     */
    @Override
    public int hashCode() {
        return x * 31 + y * 63;
    }
}
