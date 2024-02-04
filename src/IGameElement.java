/**
 * IGameElement
 * Abstract class for game elements
 */

public abstract class IGameElement {
    /**
     * X coordinate
     */
    public double x;

    /**
     * Y coordinate
     */
    public double y;

    /**
     * Constructor
     *
     * @param x X coordinate
     * @param y Y coordinate
     */
    public IGameElement(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor
     */
    public IGameElement(){
    }

    /**
     * Get area of an element
     *
     * @return the area of an element
     */
    public abstract double getArea();
}
