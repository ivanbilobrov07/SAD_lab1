/**
 * CircleElement
 * Subclass of IGameElement that represents a circle element
 */
public class CircleElement extends IGameElement {
    /**
     * X coordinate
     */
    public double x;
    /**
     * Y coordinate
     */
    public double y;
    /**
     * Radius of a circle
     */
    public double r;

    /**
     * Constructor
     *
     * @param x x coordinate
     * @param y y coordinate
     * @param r radius
     */
    public CircleElement(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    /**
     * Get area of a circle
     *
     * @return the area of a circle
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.r, 2);
    }
}
