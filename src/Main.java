import java.awt.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(12, 10);
        Triangle triangle = new Triangle(5, 10);
        circle.area();
        rectangle.area();
        triangle.area();
    }
}
