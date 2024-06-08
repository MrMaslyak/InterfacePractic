import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(12, 10.5, 20);
        Triangle triangle = new Triangle(10, 12, 15, 5);
        circle.area();
        rectangle.area();
        triangle.area();
        System.out.println("-------------");
        circle.perimetr();
        rectangle.perimetr();
        triangle.perimetr();
        System.out.println("**************************************************");
        Dog dog = new Dog("Buddy", 3, "Golden Retriever", 20);
        Cat cat = new Cat("Whiskers", 2, "Siamese", 5);
        Bird bird = new Bird("Tweety", 1, "Canary", 1);
        dog.foodAnimal();
        dog.soundAnimal();
        System.out.println("-----");
        cat.foodAnimal();
        cat.soundAnimal();
        System.out.println("-----");
        bird.foodAnimal();
        bird.soundAnimal();
        System.out.println("-----");
        printInformation(new Information[]{circle, rectangle, triangle, dog, cat, bird});
    }

    public static void printInformation(Information[] objects) {
        for (Information obj : objects) {
            obj.printInfo();
            System.out.println("**************************************************");
        }
    }

}
