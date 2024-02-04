/**
 * CircleElement
 * Subclass of IGameElement that represents a circle element
 */
public class CircleElement extends IGameElement {
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
        super(x, y);
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
