public class Main {
    public static void main(String[] args) {
        CompositeElement compositeElement = new CompositeElement();

        RectangleElement rec1 = new RectangleElement(10, 5);
        RectangleElement rec2 = new RectangleElement(2, 4);
        CircleElement circle = new CircleElement(0, 0, 3);

        compositeElement.add(rec1);
        compositeElement.add(rec2);
        compositeElement.add(circle);

        System.out.println(compositeElement.getArea());

        compositeElement.remove(circle);

        System.out.println(compositeElement.getArea());
    }
}