import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(10, 20));
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.calculateArea());
        }
        System.out.println(new Shape());
    }
}