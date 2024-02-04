import java.util.ArrayList;
import java.util.List;

/**
 * Composition class
 * Contains a list of Game Elements
 */
public class CompositeElement extends IGameElement{
    /**
     * List of game elements
     */
    public List<IGameElement> elements = new ArrayList<>();

    /**
     * Constructor
     */
    public CompositeElement(){};

    /**
     * Add game element to a list
     *
     * @param element game element to add
     */
    public void add(IGameElement element) {
        elements.add(element);
    }

    /**
     * Remove game element from a list
     *
     * @param element game element to remove
     */
    public void remove(IGameElement element) {
        elements.remove(element);
    }


    /**
     * Get area of all game elements
     *
     * @return the sum of elements areas
     */
    @Override
    public double getArea() {
        double area = 0;

        for (IGameElement element: elements) {
            area += element.getArea();
        }

        return area;
    }
}
