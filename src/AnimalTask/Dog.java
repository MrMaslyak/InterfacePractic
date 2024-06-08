package AnimalTask;

public class Dog extends Pet {
    public Dog(String name, int age, String breed, int weight) {
        super(name, age, breed, weight);
    }

    @Override
    public void soundAnimal() {
        System.out.println("gav gav");
    }

    @Override
    public void foodAnimal() {
        System.out.println("eat meat");
    }

    @Override
    public int getWeight() {
        return 20;
    }
}
