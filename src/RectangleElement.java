/**
 * RectangleElement
 * Subclass of IGameElement that represents a rectangle element
 */
public class RectangleElement extends IGameElement {
    /**
     * Constructor
     *
     * @param x x coordinate
     * @param y y coordinate
     */
    public RectangleElement(double x, double y){
        super(x, y);
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
