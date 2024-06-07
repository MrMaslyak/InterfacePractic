public class Cat extends Pet{
    public Cat(String name, int age, String breed, int weight) {
        super(name, age, breed, weight);
    }

    @Override
    public void soundAnimal() {
        System.out.println("may may");
    }

    @Override
    public void foodAnimal() {
        System.out.println("eat fish");
    }

    @Override
    public int getWeight() {
        return 5;
    }
}
