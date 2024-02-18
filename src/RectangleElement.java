/**
 * RectangleElement
 * Subclass of IGameElement that represents a rectangle element
 */
public class RectangleElement extends IGameElement {
    /**
     * First side length
     */
    public double x;
    /**
     * Second side length
     */
    public double y;

    /**
     * Constructor
     *
     * @param x first side length
     * @param y second side length
     */
    public RectangleElement(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Get area of a rectangle
     *
     * @return the area of a rectangle
     */
    @Override
    public double getArea() {
        return this.x * this.y;
    }
}
