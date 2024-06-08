package AnimalTask;

public class Bird extends Pet {
    public Bird(String name, int age, String breed, int weight) {
        super(name, age, breed, weight);
    }

    @Override
    public void soundAnimal() {
        System.out.println("kyrik kyrlik");
    }

    @Override
    public void foodAnimal() {
        System.out.println("eat bread");
    }

    @Override
    public int getWeight() {
        return 1;
    }
}
