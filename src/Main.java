import AnimalTask.*;
import GeometryTask.*;
import Interface.Information;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometryFigure> geometryFigures = new ArrayList<>();
        ArrayList<Pet> pets = new ArrayList<>();

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(12, 10.5, 20);
        Triangle triangle = new Triangle(10, 12, 15, 5);

        geometryFigures.add(circle);
        geometryFigures.add(rectangle);
        geometryFigures.add(triangle);

        System.out.println("GEOMETRY FIGURES");
        System.out.println("================");
        for (GeometryFigure figure : geometryFigures) {
            figure.area();
            System.out.println();
        }

        System.out.println("-------------");
        for (GeometryFigure figure : geometryFigures) {
            figure.perimetr();
            System.out.println();
        }

        System.out.println("**************************************************");

        Dog dog = new Dog("Buddy", 3, "Golden Retriever", 20);
        Cat cat = new Cat("Whiskers", 2, "Siamese", 5);
        Bird bird = new Bird("Tweety", 1, "Canary", 1);

        pets.add(dog);
        pets.add(cat);
        pets.add(bird);

        System.out.println("ANIMALS");
        System.out.println("=======");
        dog.foodAnimal();
        dog.soundAnimal();
        System.out.println("-----");
        cat.foodAnimal();
        cat.soundAnimal();
        System.out.println("-----");
        bird.foodAnimal();
        bird.soundAnimal();
        System.out.println("**************************************************");

        printInformation(geometryFigures);
        printInformation(pets);
    }

    public static void printInformation(ArrayList<? extends Information> objects) {
        System.out.println("INFORMATION SUMMARY");
        System.out.println("===================");
        for (Information obj : objects) {
            obj.printInfo();
            System.out.println("**************************************************");
        }
    }
}
